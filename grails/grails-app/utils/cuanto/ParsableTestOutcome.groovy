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

package cuanto

import java.math.BigDecimal

/**
 * User: Todd Wells
 * Date: May 13, 2008
 * Time: 9:15:31 PM
 *
 */
class ParsableTestOutcome {
	ParsableTestCase testCase
	String testResult
    String testOutput
    BigDecimal duration
    String owner
    String bug
    String note
}