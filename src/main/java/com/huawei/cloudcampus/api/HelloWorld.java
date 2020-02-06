package com.huawei.cloudcampus.api;

import com.huawei.cloudcampus.api.model.AclDtoDetail;
import com.huawei.cloudcampus.api.model.GetUsergroupsOutputDto;
import com.huawei.cloudcampus.api.model.RuleList;
import com.huawei.cloudcampus.api.model.UpdateAclRet;
import com.huawei.cloudcampus.api.service.AclTemplateNBNorthBoundApi;
import com.huawei.cloudcampus.api.service.UsergroupsMgrApi;

import java.util.ArrayList;

public class HelloWorld {

	public static void main(String[] args) {

		try {

			// 初始化SDK连接客户端, 需要创建北向账号， 详见：如何创建北向账号
			// 需要配置将要访问的控制器的域名或IP、端口（在申请的沙箱环境Agile Controller-Campus属性中有IP及端口信息），
			// 如何创建北向账号 http://devzone.huawei.com/cn/enterprise/campus/account.html

			// 创建client
			ApiClient apiClient = new ApiClient();
			apiClient.setTenantName("test@north.com");
			apiClient.setTenantPwd("Huawei@123");
			apiClient.setHost("139.9.213.72");
			apiClient.setPort("18002");

			// 需要创建的ACL模板数据
			AclDtoDetail body = new AclDtoDetail();
			body.setName("ACL测试模板6000");
			body.setAclNumber("6000");
			body.setDescription("测试用的ACL模板");
			body.setAclType(AclDtoDetail.AclTypeEnum.USER);

			// ACL规则列表, 网段是8.8.8.8/32的ACL规则， 并创建域名规则www.huawei.com的ACL模板

			ArrayList<RuleList> rules = new ArrayList<RuleList>();
			RuleList rule1 = new RuleList();
			rule1.setIp("8.8.8.8/32");
			rule1.setDescription("这是IP规则");
			rules.add(rule1);
			RuleList rule2 = new RuleList();
			rule2.setDomain("www.huawei.com");
			rule2.setDescription("这是域名规则");
			rules.add(rule2);
			body.setRuleList(rules);

			// 添加模板， 返回模板ID
			UpdateAclRet response = new AclTemplateNBNorthBoundApi(apiClient).addAclTemplate(body);
			String aclTemplateId = response.getData().getId().toString();
			System.out.println("aclTemplateId: " + aclTemplateId); // 打印出新增模板的id


			// UsergroupsMgrApi api = new UsergroupsMgrApi(apiClient);
			// String userGroupId = "";
			// String userGroupName = "";
			// Boolean isContainSubGroup = false;
			// Integer pageIndex = 1;
			// Integer pageSize = 20;
			// String sort = "";
			//
			// GetUsergroupsOutputDto response = api.getUsergroups(userGroupId, userGroupName, isContainSubGroup, pageIndex, pageSize, sort);
			// System.out.println(response);

		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
