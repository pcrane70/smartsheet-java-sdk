package com.smartsheet.api.models;

/*
 * #[license]
 * Smartsheet Java SDK
 * %%
 * Copyright (C) 2014 - 2015 Smartsheet
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * %[license]
 */

/**
 * Represents the Contact object.
 */
public class Contact extends IdentifiableModel<Long>{
    /* Represents the contact id*/
    private String id;

    /** Represents the conatct name. */
    private String name;

    /** Represents the contact email. */
    private String email;

    public String getContactId() {
        return id;
    }

    public void setContactId(String contactId) {
        this.id = contactId;
    }

    /**
     * Gets the full name for the contact.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name for the contact
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the email for the contact.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email for the contact
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
