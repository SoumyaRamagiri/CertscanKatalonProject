package loginPageMethods

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.annotation.Keyword

public class LoginPageFunctions {
	@Keyword
	def login(String url, String usrNm, String pwd){
		WebUI.openBrowser('')

		WebUI.navigateToUrl("http://10.204.211.125:8041/csview")

		WebUI.setText(findTestObject('Page_Login/input_Language localization data unavailabl_e21466'), 'karenmiller')

		WebUI.setEncryptedText(findTestObject('Page_Login/input_User ID cannot be empty_password'), 'cvW8qx4B2o3F4VwP/kNsqA==')
	}
}

