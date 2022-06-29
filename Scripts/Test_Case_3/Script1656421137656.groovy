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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://login.lsq-staging.com/')

WebUI.setText(findTestObject('Object Repository/Obj_TC_3/Page_LeadSquared Application/input_Please enter your login details_EmailID'), 
    'poonawallaSGP@mailinator.com')

WebUI.click(findTestObject('Object Repository/Obj_TC_3/Page_LeadSquared Application/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/Obj_TC_3/Page_LeadSquared Application/input_Please enter your password_Password'), 
    'hpTj/Kl7/jOfeaRdjLViDw==')

WebUI.click(findTestObject('Object Repository/Obj_TC_3/Page_LeadSquared Application/button_Next_1'))

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Object Repository/Obj_TC_3/Page_Welcome/span_Ting Vit_toolbar-action-icon'), 
    0)

WebUI.waitForElementPresent(findTestObject('Object Repository/Obj_TC_3/Page_Welcome/span_Ting Vit_toolbar-action-icon'), 
    0)

WebUI.click(findTestObject('Object Repository/Obj_TC_3/Page_Welcome/span_Ting Vit_toolbar-action-icon'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Obj_TC_3/Page_Welcome/a_Sign Out'))

WebUI.click(findTestObject('Object Repository/Obj_TC_3/Page_Welcome/a_Sign Out'))

