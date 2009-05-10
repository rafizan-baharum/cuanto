/*
 Copyright (c) 2008 thePlatform, Inc.

This file is part of Cuanto, a test results repository and analysis program.

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Lesser General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.

*/

package cuanto.formatter

/**
 * User: Todd Wells
 * Date: Apr 3, 2009
 * Time: 6:22:01 PM
 * 
 */
class ClassnameFormatter implements TestNameFormatter {

	public String getTestName(String packageName, String testName) {
		def pattern = ~/.+\.(.+$)/
		
		def matcher = pattern.matcher(packageName)
		if (matcher.matches()) {
			def className = matcher[0][1]
			return "${className}.${testName}()" 
		} else {
			return "${testName}()"
		}
	}


	public String getDescription() {
		"Class.testMethod()"
	}


	public String getKey() {
		"classname"
	}
}