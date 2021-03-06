/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.pushnotifications.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the PushNotificationsEntry service. Represents a row in the &quot;PushNotificationsEntry&quot; database table, with each column mapped to a property of this class.
 *
 * @author Bruno Farache
 * @see PushNotificationsEntryModel
 * @see com.liferay.pushnotifications.model.impl.PushNotificationsEntryImpl
 * @see com.liferay.pushnotifications.model.impl.PushNotificationsEntryModelImpl
 * @generated
 */
@ProviderType
public interface PushNotificationsEntry extends PushNotificationsEntryModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.liferay.pushnotifications.model.impl.PushNotificationsEntryImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	@com.liferay.portal.kernel.json.JSON()
	public com.liferay.portal.kernel.json.JSONObject getUser();

	public void setUser(
		com.liferay.portal.kernel.json.JSONObject userJSONObject);
}