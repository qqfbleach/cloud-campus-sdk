package com.huawei.cloudcampus.api;

import com.huawei.cloudcampus.api.model.AuthContentDto;
import com.huawei.cloudcampus.api.model.ConfigSsidResponse;
import com.huawei.cloudcampus.api.model.CreateDeviceBean;
import com.huawei.cloudcampus.api.model.CreateDeviceDto;
import com.huawei.cloudcampus.api.model.CreateSiteDto;
import com.huawei.cloudcampus.api.model.CreateSiteDtoData;
import com.huawei.cloudcampus.api.model.CreateSiteOut;
import com.huawei.cloudcampus.api.model.Device;
import com.huawei.cloudcampus.api.model.PolicyContentDto;
import com.huawei.cloudcampus.api.model.PortalContentDto;
import com.huawei.cloudcampus.api.model.RateLimitContentDto;
import com.huawei.cloudcampus.api.model.SsidConfigDto;
import com.huawei.cloudcampus.api.service.ApssidCfgNorthboundApi;
import com.huawei.cloudcampus.api.service.DeviceNorthboundApi;
import com.huawei.cloudcampus.api.service.SiteManagerApi;

import java.util.ArrayList;
import java.util.Collections;

public class CreateSSID {

	public static void main(String[] args) {

		// 初始化SDK连接客户端, 需要创建北向账号， 详见：如何创建北向账号
		// 需要配置将要访问的控制器的域名或IP、端口（在申请的沙箱环境Agile Controller-Campus属性中有IP及端口信息），
		// 如何创建北向账号 http://devzone.huawei.com/cn/enterprise/campus/account.html

		// 创建client
		ApiClient apiClient = new ApiClient();
		apiClient.setTenantName("test@north.com");
		apiClient.setTenantPwd("Huawei@123");
		apiClient.setHost("139.9.213.72");
		apiClient.setPort("18002");

		// 待创建的站点信息
		CreateSiteDtoData createSiteDtoData = new CreateSiteDtoData();
		createSiteDtoData.setName("测试站点1");
		createSiteDtoData.setDescription("创建SSID测试站点");
		createSiteDtoData.setType(Collections.singletonList(CreateSiteDtoData.TypeEnum.AP));
		ArrayList<CreateSiteDtoData> createSiteDtoDatas = new ArrayList<>();
		createSiteDtoDatas.add(createSiteDtoData);
		CreateSiteDto createSiteDto = new CreateSiteDto();
		createSiteDto.setSites(createSiteDtoDatas);

		// 创建站点
		SiteManagerApi siteManagerApi = new SiteManagerApi(apiClient);
		CreateSiteOut siteRes;
		try {
			siteRes = siteManagerApi.createSites(createSiteDto);
			String siteId = siteRes.getSuccess().get(0).getId(); // 获取站点id
			System.out.println("siteId: " + siteId);
			// 待创建的设备信息
			Device device = new Device();
			device.setEsn("AA50082935AAAA000000");
			device.setSiteId(siteId); // 设备加入刚刚创建的站点
			device.setName("测试AP1");
			CreateDeviceDto createDeviceDto = new CreateDeviceDto();

			createDeviceDto.addDevicesItem(device);

			// 创建设备
			DeviceNorthboundApi deviceNorthboundApi = new DeviceNorthboundApi(apiClient);
			CreateDeviceBean deviceRes = deviceNorthboundApi.createDevices(createDeviceDto);
			System.out.println("device id:" + deviceRes.getSuccess().get(0).getId());

			// 待创建的SSID信息
			SsidConfigDto ssidConfigDto = new SsidConfigDto();
			ssidConfigDto.setName("测试ssid");
			ssidConfigDto.setEnable(true);
			ssidConfigDto.setConnectionMode(SsidConfigDto.ConnectionModeEnum.NAT);
			ssidConfigDto.setHidedEnable(false);
			ssidConfigDto.setRelativeRadios(3);
			ssidConfigDto.setMaxUserNumber(10);
			ssidConfigDto.setUserSeparation(false);
			AuthContentDto authContentDto = new AuthContentDto();
			authContentDto.setMode(AuthContentDto.ModeEnum.OPEN);
			PortalContentDto portalContentDto = new PortalContentDto();
			portalContentDto.setMode(PortalContentDto.ModeEnum.PORTALDISABLE);
			authContentDto.setPortal(portalContentDto);
			ssidConfigDto.setSsidAuth(authContentDto);
			RateLimitContentDto rateLimitContentDto = new RateLimitContentDto();

			rateLimitContentDto.setUpEnable(false);
			rateLimitContentDto.setDownEnable(false);
			PolicyContentDto policyContentDto = new PolicyContentDto();
			policyContentDto.setSsidRateLimit(rateLimitContentDto);
			policyContentDto.setTerminalRateLimit(rateLimitContentDto);
			ssidConfigDto.setSsidPolicy(policyContentDto);

			// 创建SSID
			ApssidCfgNorthboundApi apNetcfgApSsidNorthboundApi = new ApssidCfgNorthboundApi(apiClient);
			ConfigSsidResponse ssidRes = apNetcfgApSsidNorthboundApi.createSiteSsidConfig(siteId, ssidConfigDto);
			String ssid = ssidRes.getData().getId();
			System.out.println("ssid id:" + ssid);

		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
