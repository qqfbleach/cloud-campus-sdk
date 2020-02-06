package com.huawei.cloudcampus.api.sample;

// import com.huawei.cloudcampus.api.ApiClient;
// import com.huawei.cloudcampus.api.ApiException;
// import com.huawei.cloudcampus.api.model.*;
// import com.huawei.cloudcampus.api.service.AclTemplateNBNorthBoundApi;
// import com.huawei.cloudcampus.api.service.ApNetcfgApSsidNorthboundApi;
// import com.huawei.cloudcampus.api.service.ApNetcfgPortalPageRuleNorthboundApi;
// import com.huawei.cloudcampus.api.service.SiteManagerApi;
//
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
import java.util.List;

public class ClientSample {
	private static final String POST_TOKEN_URL = "/controller/v2/tokens";
	private static final String GET_SITES_URL = "/controller/campus/v3/sites";


// 	static {
// 		String tenantName = "campus@north.com   ";
// 		String tenantPwd = "Huawei@123";
// 		String address = "192.89.35.234";
// 		String port = "18002";
// 		ApiClient apiClient = new ApiClient();
// 		apiClient.setTenantName(tenantName);
// 		apiClient.setTenantPwd(tenantPwd);
// 		apiClient.setHost(address);
// 		apiClient.setPort(port);
//
// 		siteManagerApi = new SiteManagerApi(apiClient);
// 		aclTemplateNBNorthBoundApi = new AclTemplateNBNorthBoundApi(apiClient);
// 		apNetcfgApSsidNorthboundApi = new ApNetcfgApSsidNorthboundApi(apiClient);
// 		apNetcfgPortalPageRuleNorthboundApi = new ApNetcfgPortalPageRuleNorthboundApi(apiClient);
// 	}
//
// 	private static SiteManagerApi siteManagerApi;
//
// 	private static AclTemplateNBNorthBoundApi aclTemplateNBNorthBoundApi;
//
// 	private static ApNetcfgApSsidNorthboundApi apNetcfgApSsidNorthboundApi;
//
// 	private static ApNetcfgPortalPageRuleNorthboundApi apNetcfgPortalPageRuleNorthboundApi;
//
// 	public static void main(String[] args) throws ApiException {
// 		System.setProperty("http.proxySet", "true");
// 		System.setProperty("http.proxyHost", "127.0.0.1");
// 		System.setProperty("http.proxyPort", "8888");
// 		String tokenId = getTokenId();
// 		System.out.println("*** The token id is:" + tokenId);
// 		// 配置ACL模板，用于放通Portal的IP或域名
// //		AclDtoDetail body = new AclDtoDetail();
// //		body.setName("测试ACL模板名称");
// //		body.setAclNumber("6000");
// //		body.setDescription("测试ACL模板的描述");
// //		body.setAclType(AclDtoDetail.AclTypeEnum.USER);
// //		ArrayList<RuleList> ruleLists = new ArrayList<>();
// //		RuleList ruleList = new RuleList();
// //		ruleList.setIp("180.97.83.39/32");
// //		// ruleList.setDomain("www.huawei.com");
// //		ruleList.setDescription("规则描述");
// //		ruleLists.add(ruleList);
// //		body.setRuleList(ruleLists);
// //
// //		UpdateAclRet response1 = aclTemplateNBNorthBoundApi.addAclTemplate(body);
// //		System.out.println(response1);
// //		String aclTemplateId = response1.getData().getId().toString();
// //		System.out.println("aclTemplateId: " + aclTemplateId);
// //		System.out.println("-------------------");
//
// 		// 配置URL模板，定义访问Portal Page URL时，新网程要求传递的参数名称及取值
// 		// 无yaml或文档
//
// 		// 配置RADIUS中继服务器模板，定义认证和计费的IP、端口等信息
// 		// 无yaml或文档
//
// 		// 创建站点
// //		CreateSiteDto createSiteDto = new CreateSiteDto();
// //		ArrayList<CreateSiteDtoData> createSiteDtoDatas = new ArrayList<>();
// //		CreateSiteDtoData createSiteDtoData = new CreateSiteDtoData();
// //		createSiteDtoData.setName("测试站点名称1");
// //		createSiteDtoData.setDescription("站点描述");
// //		createSiteDtoData.setType(Collections.singletonList("AP"));
// //		createSiteDtoDatas.add(createSiteDtoData);
// //		createSiteDto.setSites(createSiteDtoDatas);
// //
// //		CreateSiteOut sites = siteManagerApi.createSites(createSiteDto);
// //		System.out.println(sites);
// //		String siteId = sites.getSuccess().get(0).getId();
// //		System.out.println("siteId: " + siteId);
// //
// //
// //		// 配置SSID
// //		SsidConfigDto ssidConfigDto = new SsidConfigDto();
// //		ssidConfigDto.setName("测试ssid名称");
// //		ssidConfigDto.setEnable(true);
// //		ssidConfigDto.setConnectionMode(SsidConfigDto.ConnectionModeEnum.NAT);
// //		ssidConfigDto.setHidedEnable(false);
// //		ssidConfigDto.setRelativeRadios(3);
// //		ssidConfigDto.setMaxUserNumber(10);
// //		ssidConfigDto.setUserSeparation(false);
// //		AuthContentDto authContentDto = new AuthContentDto();
// //		authContentDto.setMode(AuthContentDto.ModeEnum.OPEN);
// //		PortalContentDto portalContentDto = new PortalContentDto();
// //		portalContentDto.setMode(PortalContentDto.ModeEnum.PORTALTHIRDINDIRECT);
// //		portalContentDto.setFreeAuthEnable(true);
// //		portalContentDto.setAuthExpireUnit("day");
// //		portalContentDto.setAuthExpire(10);
// //		portalContentDto.setEscapeStrategy(2);
// //		portalContentDto.setFreeAclTmplId(aclTemplateId);
// //		authContentDto.setPortal(portalContentDto);
// //		ssidConfigDto.setSsidAuth(authContentDto);
// //		PolicyContentDto policyContentDto = new PolicyContentDto();
// //		RateLimitContentDto rateLimitContentDto = new RateLimitContentDto();
// //		rateLimitContentDto.setUpEnable(true);
// //		rateLimitContentDto.setUpLimit("50");
// //		rateLimitContentDto.setDownEnable(true);
// //		rateLimitContentDto.setDownLimit("50");
// //		policyContentDto.setSsidRateLimit(rateLimitContentDto);
// //		policyContentDto.setTerminalRateLimit(rateLimitContentDto);
// //		ssidConfigDto.setSsidPolicy(policyContentDto);
// //
// //		ConfigSsidResponse response2 = apNetcfgApSsidNorthboundApi.createSiteSsidConfig(siteId, ssidConfigDto);
// //		System.out.println(response2);
// //		String ssid = response2.getData().getId();
// //		System.out.println("ssid: " + ssid);
// //		System.out.println("-----------------------");
// //
// //		// 配置Portal页面推送策略
// //		AddPortalPageRuleInputDto portalPageRule = new AddPortalPageRuleInputDto();
// //		portalPageRule.setName("测试Portal页面推送策略");
// //		portalPageRule.setDescription("测试Portal页面推送策略的描述");
// //		portalPageRule.setSsIds(Arrays.asList(ssid));
// //		portalPageRule.setPushMode(0);
// //		portalPageRule.setThirdPageUrl("http://180.97.83.39:9080/portal/auth/ncSrvDispLogin.htm");
// //
// //		CommonPortalPageRuleOutputDto response3 = apNetcfgPortalPageRuleNorthboundApi.addPortalPageRule(siteId, portalPageRule);
// //		System.out.println(response3);
// 	}

	public static String getTokenId(){
		GetTokenIdRequest request = new GetTokenIdRequest();

		System.out.println(PropsUtil.getPropByKey(APIConstants.CAMPUS_USERNAME));
		System.out.println(PropsUtil.getPropByKey(APIConstants.CAMPUS_PASSWORD));
		request.setUserName(PropsUtil.getPropByKey(APIConstants.CAMPUS_USERNAME));
		request.setPassword(PropsUtil.getPropByKey(APIConstants.CAMPUS_PASSWORD));
		String startWith = APIConstants.PROTOCOL_HTTPS + "://" + PropsUtil.getPropByKey(APIConstants.CAMPUS_ADDRESS) + ":" + PropsUtil.getPropByKey(APIConstants.CAMPUS_PORT);

		String json = RestfulApiInvoker.invoke(request, startWith + POST_TOKEN_URL, HttpMethodEnum.POST);
		GetTokenIdResponse response = JacksonSerialized.json2Obj(json, GetTokenIdResponse.class);

		if (response == null || response.getData() == null) {
			System.out.println("No token data ...");
			return null;
		}else {
			return response.getData().getToken_id();
		}
	}
	private static List<SiteData> querySites(String token) {
		String json = RestfulApiInvoker.invokeWithToken(null, GET_SITES_URL, HttpMethodEnum.GET, token);
		QuerySitesResponse response = JacksonSerialized.json2Obj(json, QuerySitesResponse.class);
		if (response == null || response.getData() == null) {

			return null;
		}else {
			return response.getData();
		}
	}

}
