/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.shopping.service;

/**
 * <p>
 * This class is a wrapper for {@link ShoppingItemPriceLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       ShoppingItemPriceLocalService
 * @generated
 */
public class ShoppingItemPriceLocalServiceWrapper
	implements ShoppingItemPriceLocalService {
	public ShoppingItemPriceLocalServiceWrapper(
		ShoppingItemPriceLocalService shoppingItemPriceLocalService) {
		_shoppingItemPriceLocalService = shoppingItemPriceLocalService;
	}

	/**
	* Adds the shopping item price to the database. Also notifies the appropriate model listeners.
	*
	* @param shoppingItemPrice the shopping item price to add
	* @return the shopping item price that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.shopping.model.ShoppingItemPrice addShoppingItemPrice(
		com.liferay.shopping.model.ShoppingItemPrice shoppingItemPrice)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shoppingItemPriceLocalService.addShoppingItemPrice(shoppingItemPrice);
	}

	/**
	* Creates a new shopping item price with the primary key. Does not add the shopping item price to the database.
	*
	* @param itemPriceId the primary key for the new shopping item price
	* @return the new shopping item price
	*/
	public com.liferay.shopping.model.ShoppingItemPrice createShoppingItemPrice(
		long itemPriceId) {
		return _shoppingItemPriceLocalService.createShoppingItemPrice(itemPriceId);
	}

	/**
	* Deletes the shopping item price with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param itemPriceId the primary key of the shopping item price to delete
	* @throws PortalException if a shopping item price with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteShoppingItemPrice(long itemPriceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_shoppingItemPriceLocalService.deleteShoppingItemPrice(itemPriceId);
	}

	/**
	* Deletes the shopping item price from the database. Also notifies the appropriate model listeners.
	*
	* @param shoppingItemPrice the shopping item price to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteShoppingItemPrice(
		com.liferay.shopping.model.ShoppingItemPrice shoppingItemPrice)
		throws com.liferay.portal.kernel.exception.SystemException {
		_shoppingItemPriceLocalService.deleteShoppingItemPrice(shoppingItemPrice);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shoppingItemPriceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _shoppingItemPriceLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shoppingItemPriceLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shoppingItemPriceLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the shopping item price with the primary key.
	*
	* @param itemPriceId the primary key of the shopping item price to get
	* @return the shopping item price
	* @throws PortalException if a shopping item price with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.shopping.model.ShoppingItemPrice getShoppingItemPrice(
		long itemPriceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _shoppingItemPriceLocalService.getShoppingItemPrice(itemPriceId);
	}

	/**
	* Gets a range of all the shopping item prices.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of shopping item prices to return
	* @param end the upper bound of the range of shopping item prices to return (not inclusive)
	* @return the range of shopping item prices
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.shopping.model.ShoppingItemPrice> getShoppingItemPrices(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shoppingItemPriceLocalService.getShoppingItemPrices(start, end);
	}

	/**
	* Gets the number of shopping item prices.
	*
	* @return the number of shopping item prices
	* @throws SystemException if a system exception occurred
	*/
	public int getShoppingItemPricesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shoppingItemPriceLocalService.getShoppingItemPricesCount();
	}

	/**
	* Updates the shopping item price in the database. Also notifies the appropriate model listeners.
	*
	* @param shoppingItemPrice the shopping item price to update
	* @return the shopping item price that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.shopping.model.ShoppingItemPrice updateShoppingItemPrice(
		com.liferay.shopping.model.ShoppingItemPrice shoppingItemPrice)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shoppingItemPriceLocalService.updateShoppingItemPrice(shoppingItemPrice);
	}

	/**
	* Updates the shopping item price in the database. Also notifies the appropriate model listeners.
	*
	* @param shoppingItemPrice the shopping item price to update
	* @param merge whether to merge the shopping item price with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the shopping item price that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.shopping.model.ShoppingItemPrice updateShoppingItemPrice(
		com.liferay.shopping.model.ShoppingItemPrice shoppingItemPrice,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shoppingItemPriceLocalService.updateShoppingItemPrice(shoppingItemPrice,
			merge);
	}

	public java.util.List<com.liferay.shopping.model.ShoppingItemPrice> getItemPrices(
		long itemId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _shoppingItemPriceLocalService.getItemPrices(itemId);
	}

	public ShoppingItemPriceLocalService getWrappedShoppingItemPriceLocalService() {
		return _shoppingItemPriceLocalService;
	}

	private ShoppingItemPriceLocalService _shoppingItemPriceLocalService;
}