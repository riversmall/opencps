
/*******************************************************************************
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
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/


package org.opencps.accountmgt.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import org.opencps.accountmgt.model.BusinessDomain;
import org.opencps.accountmgt.service.BusinessDomainService;
import org.opencps.accountmgt.service.persistence.BusinessAccountPersistence;
import org.opencps.accountmgt.service.persistence.BusinessDomainPersistence;
import org.opencps.accountmgt.service.persistence.BusinessPersistence;
import org.opencps.accountmgt.service.persistence.CitizenPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the business domain remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link org.opencps.accountmgt.service.impl.BusinessDomainServiceImpl}.
 * </p>
 *
 * @author khoavd
 * @see org.opencps.accountmgt.service.impl.BusinessDomainServiceImpl
 * @see org.opencps.accountmgt.service.BusinessDomainServiceUtil
 * @generated
 */
public abstract class BusinessDomainServiceBaseImpl extends BaseServiceImpl
	implements BusinessDomainService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link org.opencps.accountmgt.service.BusinessDomainServiceUtil} to access the business domain remote service.
	 */

	/**
	 * Returns the business local service.
	 *
	 * @return the business local service
	 */
	public org.opencps.accountmgt.service.BusinessLocalService getBusinessLocalService() {
		return businessLocalService;
	}

	/**
	 * Sets the business local service.
	 *
	 * @param businessLocalService the business local service
	 */
	public void setBusinessLocalService(
		org.opencps.accountmgt.service.BusinessLocalService businessLocalService) {
		this.businessLocalService = businessLocalService;
	}

	/**
	 * Returns the business remote service.
	 *
	 * @return the business remote service
	 */
	public org.opencps.accountmgt.service.BusinessService getBusinessService() {
		return businessService;
	}

	/**
	 * Sets the business remote service.
	 *
	 * @param businessService the business remote service
	 */
	public void setBusinessService(
		org.opencps.accountmgt.service.BusinessService businessService) {
		this.businessService = businessService;
	}

	/**
	 * Returns the business persistence.
	 *
	 * @return the business persistence
	 */
	public BusinessPersistence getBusinessPersistence() {
		return businessPersistence;
	}

	/**
	 * Sets the business persistence.
	 *
	 * @param businessPersistence the business persistence
	 */
	public void setBusinessPersistence(BusinessPersistence businessPersistence) {
		this.businessPersistence = businessPersistence;
	}

	/**
	 * Returns the business account local service.
	 *
	 * @return the business account local service
	 */
	public org.opencps.accountmgt.service.BusinessAccountLocalService getBusinessAccountLocalService() {
		return businessAccountLocalService;
	}

	/**
	 * Sets the business account local service.
	 *
	 * @param businessAccountLocalService the business account local service
	 */
	public void setBusinessAccountLocalService(
		org.opencps.accountmgt.service.BusinessAccountLocalService businessAccountLocalService) {
		this.businessAccountLocalService = businessAccountLocalService;
	}

	/**
	 * Returns the business account remote service.
	 *
	 * @return the business account remote service
	 */
	public org.opencps.accountmgt.service.BusinessAccountService getBusinessAccountService() {
		return businessAccountService;
	}

	/**
	 * Sets the business account remote service.
	 *
	 * @param businessAccountService the business account remote service
	 */
	public void setBusinessAccountService(
		org.opencps.accountmgt.service.BusinessAccountService businessAccountService) {
		this.businessAccountService = businessAccountService;
	}

	/**
	 * Returns the business account persistence.
	 *
	 * @return the business account persistence
	 */
	public BusinessAccountPersistence getBusinessAccountPersistence() {
		return businessAccountPersistence;
	}

	/**
	 * Sets the business account persistence.
	 *
	 * @param businessAccountPersistence the business account persistence
	 */
	public void setBusinessAccountPersistence(
		BusinessAccountPersistence businessAccountPersistence) {
		this.businessAccountPersistence = businessAccountPersistence;
	}

	/**
	 * Returns the business domain local service.
	 *
	 * @return the business domain local service
	 */
	public org.opencps.accountmgt.service.BusinessDomainLocalService getBusinessDomainLocalService() {
		return businessDomainLocalService;
	}

	/**
	 * Sets the business domain local service.
	 *
	 * @param businessDomainLocalService the business domain local service
	 */
	public void setBusinessDomainLocalService(
		org.opencps.accountmgt.service.BusinessDomainLocalService businessDomainLocalService) {
		this.businessDomainLocalService = businessDomainLocalService;
	}

	/**
	 * Returns the business domain remote service.
	 *
	 * @return the business domain remote service
	 */
	public org.opencps.accountmgt.service.BusinessDomainService getBusinessDomainService() {
		return businessDomainService;
	}

	/**
	 * Sets the business domain remote service.
	 *
	 * @param businessDomainService the business domain remote service
	 */
	public void setBusinessDomainService(
		org.opencps.accountmgt.service.BusinessDomainService businessDomainService) {
		this.businessDomainService = businessDomainService;
	}

	/**
	 * Returns the business domain persistence.
	 *
	 * @return the business domain persistence
	 */
	public BusinessDomainPersistence getBusinessDomainPersistence() {
		return businessDomainPersistence;
	}

	/**
	 * Sets the business domain persistence.
	 *
	 * @param businessDomainPersistence the business domain persistence
	 */
	public void setBusinessDomainPersistence(
		BusinessDomainPersistence businessDomainPersistence) {
		this.businessDomainPersistence = businessDomainPersistence;
	}

	/**
	 * Returns the citizen local service.
	 *
	 * @return the citizen local service
	 */
	public org.opencps.accountmgt.service.CitizenLocalService getCitizenLocalService() {
		return citizenLocalService;
	}

	/**
	 * Sets the citizen local service.
	 *
	 * @param citizenLocalService the citizen local service
	 */
	public void setCitizenLocalService(
		org.opencps.accountmgt.service.CitizenLocalService citizenLocalService) {
		this.citizenLocalService = citizenLocalService;
	}

	/**
	 * Returns the citizen remote service.
	 *
	 * @return the citizen remote service
	 */
	public org.opencps.accountmgt.service.CitizenService getCitizenService() {
		return citizenService;
	}

	/**
	 * Sets the citizen remote service.
	 *
	 * @param citizenService the citizen remote service
	 */
	public void setCitizenService(
		org.opencps.accountmgt.service.CitizenService citizenService) {
		this.citizenService = citizenService;
	}

	/**
	 * Returns the citizen persistence.
	 *
	 * @return the citizen persistence
	 */
	public CitizenPersistence getCitizenPersistence() {
		return citizenPersistence;
	}

	/**
	 * Sets the citizen persistence.
	 *
	 * @param citizenPersistence the citizen persistence
	 */
	public void setCitizenPersistence(CitizenPersistence citizenPersistence) {
		this.citizenPersistence = citizenPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return BusinessDomain.class;
	}

	protected String getModelClassName() {
		return BusinessDomain.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = businessDomainPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = org.opencps.accountmgt.service.BusinessLocalService.class)
	protected org.opencps.accountmgt.service.BusinessLocalService businessLocalService;
	@BeanReference(type = org.opencps.accountmgt.service.BusinessService.class)
	protected org.opencps.accountmgt.service.BusinessService businessService;
	@BeanReference(type = BusinessPersistence.class)
	protected BusinessPersistence businessPersistence;
	@BeanReference(type = org.opencps.accountmgt.service.BusinessAccountLocalService.class)
	protected org.opencps.accountmgt.service.BusinessAccountLocalService businessAccountLocalService;
	@BeanReference(type = org.opencps.accountmgt.service.BusinessAccountService.class)
	protected org.opencps.accountmgt.service.BusinessAccountService businessAccountService;
	@BeanReference(type = BusinessAccountPersistence.class)
	protected BusinessAccountPersistence businessAccountPersistence;
	@BeanReference(type = org.opencps.accountmgt.service.BusinessDomainLocalService.class)
	protected org.opencps.accountmgt.service.BusinessDomainLocalService businessDomainLocalService;
	@BeanReference(type = org.opencps.accountmgt.service.BusinessDomainService.class)
	protected org.opencps.accountmgt.service.BusinessDomainService businessDomainService;
	@BeanReference(type = BusinessDomainPersistence.class)
	protected BusinessDomainPersistence businessDomainPersistence;
	@BeanReference(type = org.opencps.accountmgt.service.CitizenLocalService.class)
	protected org.opencps.accountmgt.service.CitizenLocalService citizenLocalService;
	@BeanReference(type = org.opencps.accountmgt.service.CitizenService.class)
	protected org.opencps.accountmgt.service.CitizenService citizenService;
	@BeanReference(type = CitizenPersistence.class)
	protected CitizenPersistence citizenPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private BusinessDomainServiceClpInvoker _clpInvoker = new BusinessDomainServiceClpInvoker();
}