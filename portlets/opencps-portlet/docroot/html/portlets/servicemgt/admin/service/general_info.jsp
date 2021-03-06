<%@page import="org.opencps.util.WebKeys"%>
<%@page import="org.opencps.servicemgt.model.ServiceInfo"%>
<%
/**
 * OpenCPS is the open source Core Public Services software
 * Copyright (C) 2016-present OpenCPS community
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>
 */
%>

<%@ include file="../../init.jsp" %>

<%
	ServiceInfo serviceInfo = (ServiceInfo) request.getAttribute(WebKeys.SERVICE_ENTRY);
%>

<aui:model-context bean="<%= serviceInfo %>" model="<%= ServiceInfo.class %>"/>

<aui:row>
	<aui:col width="100">
		<aui:input name="<%= ServiceDisplayTerms.SERVICE_NAME %>" ></aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input name="<%= ServiceDisplayTerms.SERVICE_NO %>"></aui:input>
	</aui:col>
	<aui:col width="50">
		<aui:input name="<%= ServiceDisplayTerms.SERVICE_FULLNAME %>"></aui:input>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col>
		<datamgt:ddr 
			cssClass="input100"
			depthLevel="1" 
			dictCollectionCode="SERVICE_ADMINISTRATION"
			itemNames="<%= ServiceDisplayTerms.SERVICE_ADMINISTRATION %>"
			itemsEmptyOption="true"
			selectedItems="<%= Validator.isNotNull(serviceInfo) ? serviceInfo.getAdministrationCode() : StringPool.BLANK %>"
		>
		</datamgt:ddr>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col>
		<datamgt:ddr 
			cssClass="input100"
			depthLevel="1" 
			dictCollectionCode="SERVICE_DOMAIN"
			itemNames="<%= ServiceDisplayTerms.SERVICE_DOMAINCODE %>"
			itemsEmptyOption="true"
			selectedItems="<%= Validator.isNotNull(serviceInfo) ? serviceInfo.getDomainCode() : StringPool.BLANK %>"
		>
		</datamgt:ddr>
	</aui:col>
</aui:row>


<aui:row>
	<aui:col width="100">
		<aui:input cssClass="input100" name="<%= ServiceDisplayTerms.SERVICE_ONLINEURL %>"></aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="100">
		<aui:select name="<%= ServiceDisplayTerms.SERVICE_ACTIVESTATUS %>" showEmptyOption="true">
			<aui:option value="0">
				<liferay-ui:message key="service-private"/>
			</aui:option>
			<aui:option value="1">
				<liferay-ui:message key="service-public"/>
			</aui:option>
			<aui:option value="2">
				<liferay-ui:message key="service-outdate"/>
			</aui:option>
		</aui:select>
	</aui:col>
</aui:row>
