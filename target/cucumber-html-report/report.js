$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/FF04_Compareproduct.feature");
formatter.feature({
  "line": 2,
  "name": "Prodcut comparison popup check and verify",
  "description": "",
  "id": "prodcut-comparison-popup-check-and-verify",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Compareproduct"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Adding product to compare and check product visibility",
  "description": "",
  "id": "prodcut-comparison-popup-check-and-verify;adding-product-to-compare-and-check-product-visibility",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User is on demoguru website and click mobile",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User click compare for Soney xperia and iphone",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click on COMPARE button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Pop up windows comes up and verify the prodcut inside.",
  "keyword": "Then "
});
formatter.match({
  "location": "FF04_Compareproduct.user_is_on_demoguru_website_and_click_mobile()"
});
formatter.result({
  "duration": 9250011545,
  "status": "passed"
});
formatter.match({
  "location": "FF04_Compareproduct.user_click_compare_for_Soney_xperia_and_iphone()"
});
formatter.result({
  "duration": 2340458356,
  "status": "passed"
});
formatter.match({
  "location": "FF04_Compareproduct.user_click_on_COMPARE_button()"
});
formatter.result({
  "duration": 272494873,
  "status": "passed"
});
formatter.match({
  "location": "FF04_Compareproduct.pop_up_windows_comes_up_and_verify_the_prodcut_inside()"
});
formatter.result({
  "duration": 2239259202,
  "status": "passed"
});
formatter.after({
  "duration": 266746248,
  "status": "passed"
});
});