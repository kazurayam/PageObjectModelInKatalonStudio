import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('CURA_top/h1_CURA Healthcare Service'))

WebUI.click(findTestObject('CURA_top/h3_We Care About Your Health'))

WebUI.click(findTestObject('CURA_top/a_Make Appointment'))

WebUI.click(findTestObject('CURA_modules/footer_CURA Healthcare Service'))

WebUI.setText(findTestObject('CURA_login/input_Username_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('CURA_login/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('CURA_login/button_Login'))

WebUI.selectOptionByValue(findTestObject('CURA_appointment/select_Tokyo CURA Healthcare C'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('CURA_appointment/input_Apply for hospital readm'))

WebUI.click(findTestObject('CURA_appointment/input_Medicaid_programs'))

WebUI.click(findTestObject('CURA_appointment/span_Visit Date (Required)_gly'))

WebUI.click(findTestObject('CURA_appointment/td_31'))

WebUI.setText(findTestObject('CURA_appointment/textarea_Comment_comment'), 'This is a comment')

WebUI.click(findTestObject('CURA_appointment/button_Book Appointment'))

WebUI.click(findTestObject('CURA_summary/a_Go to Homepage'))

WebUI.closeBrowser()

