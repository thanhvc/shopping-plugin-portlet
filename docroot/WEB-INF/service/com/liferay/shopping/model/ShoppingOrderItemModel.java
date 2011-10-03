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

package com.liferay.shopping.model;

import com.liferay.portal.kernel.annotation.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the ShoppingOrderItem service. Represents a row in the &quot;Shopping_ShoppingOrderItem&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.shopping.model.impl.ShoppingOrderItemModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.shopping.model.impl.ShoppingOrderItemImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this interface directly. All methods that expect a shopping order item model instance should use the {@link ShoppingOrderItem} interface instead.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ShoppingOrderItem
 * @see com.liferay.shopping.model.impl.ShoppingOrderItemImpl
 * @see com.liferay.shopping.model.impl.ShoppingOrderItemModelImpl
 * @generated
 */
public interface ShoppingOrderItemModel extends BaseModel<ShoppingOrderItem> {
	/**
	 * Gets the primary key of this shopping order item.
	 *
	 * @return the primary key of this shopping order item
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this shopping order item
	 *
	 * @param pk the primary key of this shopping order item
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the order item id of this shopping order item.
	 *
	 * @return the order item id of this shopping order item
	 */
	public long getOrderItemId();

	/**
	 * Sets the order item id of this shopping order item.
	 *
	 * @param orderItemId the order item id of this shopping order item
	 */
	public void setOrderItemId(long orderItemId);

	/**
	 * Gets the order id of this shopping order item.
	 *
	 * @return the order id of this shopping order item
	 */
	public long getOrderId();

	/**
	 * Sets the order id of this shopping order item.
	 *
	 * @param orderId the order id of this shopping order item
	 */
	public void setOrderId(long orderId);

	/**
	 * Gets the item id of this shopping order item.
	 *
	 * @return the item id of this shopping order item
	 */
	@AutoEscape
	public String getItemId();

	/**
	 * Sets the item id of this shopping order item.
	 *
	 * @param itemId the item id of this shopping order item
	 */
	public void setItemId(String itemId);

	/**
	 * Gets the sku of this shopping order item.
	 *
	 * @return the sku of this shopping order item
	 */
	@AutoEscape
	public String getSku();

	/**
	 * Sets the sku of this shopping order item.
	 *
	 * @param sku the sku of this shopping order item
	 */
	public void setSku(String sku);

	/**
	 * Gets the name of this shopping order item.
	 *
	 * @return the name of this shopping order item
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this shopping order item.
	 *
	 * @param name the name of this shopping order item
	 */
	public void setName(String name);

	/**
	 * Gets the description of this shopping order item.
	 *
	 * @return the description of this shopping order item
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this shopping order item.
	 *
	 * @param description the description of this shopping order item
	 */
	public void setDescription(String description);

	/**
	 * Gets the properties of this shopping order item.
	 *
	 * @return the properties of this shopping order item
	 */
	@AutoEscape
	public String getProperties();

	/**
	 * Sets the properties of this shopping order item.
	 *
	 * @param properties the properties of this shopping order item
	 */
	public void setProperties(String properties);

	/**
	 * Gets the price of this shopping order item.
	 *
	 * @return the price of this shopping order item
	 */
	public double getPrice();

	/**
	 * Sets the price of this shopping order item.
	 *
	 * @param price the price of this shopping order item
	 */
	public void setPrice(double price);

	/**
	 * Gets the quantity of this shopping order item.
	 *
	 * @return the quantity of this shopping order item
	 */
	public int getQuantity();

	/**
	 * Sets the quantity of this shopping order item.
	 *
	 * @param quantity the quantity of this shopping order item
	 */
	public void setQuantity(int quantity);

	/**
	 * Gets the shipped date of this shopping order item.
	 *
	 * @return the shipped date of this shopping order item
	 */
	public Date getShippedDate();

	/**
	 * Sets the shipped date of this shopping order item.
	 *
	 * @param shippedDate the shipped date of this shopping order item
	 */
	public void setShippedDate(Date shippedDate);

	/**
	 * Gets a copy of this shopping order item as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
	 *
	 * @return the escaped model instance
	 * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
	 */
	public ShoppingOrderItem toEscapedModel();

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(ShoppingOrderItem shoppingOrderItem);

	public int hashCode();

	public String toString();

	public String toXmlString();
}