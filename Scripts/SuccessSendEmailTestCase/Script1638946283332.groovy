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

WebUI.navigateToUrl('https://ie-104-flower-shop-fe-konsept-store.vercel.app/')

WebUI.click(findTestObject('Object Repository/Page_Konsept/a_About Us'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/label_Binh Dinh_label-name'))

WebUI.setText(findTestObject('Object Repository/Page_Konsept/input_Binh Dinh_from_name'), 'Katalon')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/input_Binh Dinh_reply_to'), 'annhienkt@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/textarea_T'), 'T')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/textarea_Te'), 'Te')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/textarea_T'), 'T')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/textarea_T_1'), 'Té')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/textarea_T'), 'T')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/textarea_Te'), 'Te')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/textarea_Tes'), 'Tes')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/textarea_Test'), 'Test')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/textarea_Testi'), 'Testi')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/textarea_Testin'), 'Testin')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/textarea_Testing'), 'Testing')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/textarea_Testing_1'), 'Testing ')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/textarea_Testing f'), 'Testing f')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/textarea_Testing fr'), 'Testing fr')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/textarea_Testing fro'), 'Testing fro')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/textarea_Testing from'), 'Testing from')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/textarea_Testing from_1'), 'Testing from ')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/textarea_Testing from K'), 'Testing from K')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/textarea_Testing from Ka'), 'Testing from Ka')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/textarea_Testing from Kat'), 'Testing from Kat')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/textarea_Testing from Ka'), 'Testing from Ka')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/textarea_Testing from K'), 'Testing from K')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/textarea_Testing from K_1'), 'Testing from Kâ')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/textarea_Testing from Kt'), 'Testing from Kât')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/textarea_Testing from K_1'), 'Testing from Kâ')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/textarea_Testing from K'), 'Testing from K')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/textarea_Testing from Ka'), 'Testing from Ka')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/textarea_Testing from Kat'), 'Testing from Kat')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/textarea_Testing from Kata'), 'Testing from Kata')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/textarea_Testing from Katal'), 'Testing from Katal')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/textarea_Testing from Katalo'), 'Testing from Katalo')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/textarea_Testing from Katalon'), 'Testing from Katalon')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/textarea_Testing  from Katalon'), 'Testing  from Katalon')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/textarea_Testing  from  Katalon'), 'Testing  from  Katalon')

WebUI.click(findTestObject('Object Repository/Page_Konsept/button_Send'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/div_Send email successfully'))

WebUI.closeBrowser()

