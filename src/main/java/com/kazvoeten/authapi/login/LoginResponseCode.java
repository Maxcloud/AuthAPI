/*
    This file is part of AuthAPI by Kaz Voeten.

    AuthAPI is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    AuthAPI is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with AuthAPI.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.kazvoeten.authapi.login;

/**
 *
 * @author kaz_v
 */
public enum LoginResponseCode {
    FAIL_UNKNOWN(0),
    BANNED(1),
    BLOCKED(2),
    SUCCESS(3),
    SERVICE_UNAVAILABLE(4),
    WRONG_INFO(5),
    UNVERIFIED(6);

    private int code;

    LoginResponseCode(int code) {
        this.code = code;
    }

    public int getValue() {
        return this.code;
    }
}
