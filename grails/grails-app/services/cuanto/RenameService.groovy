/*
	Copyright (c) 2010 Suk-Hyun Cho

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

class RenameService
{
	def dataService
	boolean transactional = true

	/**
	 * Replace the package of all test cases for the given project
	 * whose packageName equals the specified oldPackageName to the new specified newPackageName.
	 *
	 * @param project for which to rename packages
	 * @param oldPackageName the exact, old package name from which to rename test cases
	 * @param newPackageName the new package name to which to replace rename test cases
	 */
	void renamePackages(Project project, String oldPackageName, String newPackageName)
	{
		def findTargetTestCases = true
		while (findTargetTestCases)
		{
			def targetTestCases = TestCase.findAllByPackageName(oldPackageName, [max: 500])
			findTargetTestCases = targetTestCases.size() > 0
			renamePackages(targetTestCases, newPackageName)
		}
	}

	/**
	 * Replace the package of all given test cases to the new package name.
	 *
	 * @param testCases for which to replace the package name
	 * @param newPackageName to which to replace the package name
	 */
	void renamePackages(List<TestCase> testCases, String newPackageName)
	{
		for (TestCase targetTestCase: testCases)
		{
			targetTestCase.packageName = newPackageName
			targetTestCase.fullName = targetTestCase.packageName + "." + targetTestCase.testName
			targetTestCase.save()
		}
	}
}