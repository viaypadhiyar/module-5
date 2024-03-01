{
  "id": "cc002366-a79f-4b37-9546-91138980a4eb",
  "version": "2.0",
  "name": "test 2",
  "url": "https://www.tops-int.com",
  "tests": [{
    "id": "bb7c6235-c719-4044-9244-0973b70d602e",
    "name": "test 2",
    "commands": [{
      "id": "9762adcb-4823-499b-b1e8-4986c48b3481",
      "comment": "",
      "command": "open",
      "target": "/",
      "targets": [],
      "value": ""
    }, {
      "id": "71f1e0d6-3bbe-4a1a-9c52-764c8dd102d5",
      "comment": "",
      "command": "setWindowSize",
      "target": "1366x728",
      "targets": [],
      "value": ""
    }, {
      "id": "e47fb476-9b6b-4247-ad5c-c7bf58ca39a8",
      "comment": "",
      "command": "click",
      "target": "id=inq_name",
      "targets": [
        ["id=inq_name", "id"],
        ["name=name", "name"],
        ["css=#pill1 #inq_name", "css:finder"],
        ["xpath=//input[@id='inq_name']", "xpath:attributes"],
        ["xpath=//div[@id='pill1']/div/div[2]/div[2]/form/input", "xpath:idRelative"],
        ["xpath=//input", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "4272e72a-e9c7-4ed3-9da5-3f0a9220b59d",
      "comment": "",
      "command": "type",
      "target": "id=inq_name",
      "targets": [
        ["id=inq_name", "id"],
        ["name=name", "name"],
        ["css=#pill1 #inq_name", "css:finder"],
        ["xpath=//input[@id='inq_name']", "xpath:attributes"],
        ["xpath=//div[@id='pill1']/div/div[2]/div[2]/form/input", "xpath:idRelative"],
        ["xpath=//input", "xpath:position"]
      ],
      "value": "padhiyar vijay"
    }, {
      "id": "7fd674b2-aa33-4fbe-9065-06d36c69ef15",
      "comment": "",
      "command": "type",
      "target": "id=inq_email",
      "targets": [
        ["id=inq_email", "id"],
        ["name=email", "name"],
        ["css=#pill1 #inq_email", "css:finder"],
        ["xpath=//input[@id='inq_email']", "xpath:attributes"],
        ["xpath=//div[@id='pill1']/div/div[2]/div[2]/form/input[2]", "xpath:idRelative"],
        ["xpath=//input[2]", "xpath:position"]
      ],
      "value": "vijaypadhiyar@gmail.com"
    }, {
      "id": "220debc5-6f4a-4eee-b0c7-8337d33ed209",
      "comment": "",
      "command": "type",
      "target": "id=inq_contact",
      "targets": [
        ["id=inq_contact", "id"],
        ["name=contact", "name"],
        ["css=#pill1 #inq_contact", "css:finder"],
        ["xpath=//input[@id='inq_contact']", "xpath:attributes"],
        ["xpath=//div[@id='pill1']/div/div[2]/div[2]/form/div[2]/input", "xpath:idRelative"],
        ["xpath=//form/div[2]/input", "xpath:position"]
      ],
      "value": "8758346244"
    }]
  }],
  "suites": [{
    "id": "394cdbd6-f025-44e6-9d19-7a5d3e25d6cc",
    "name": "Default Suite",
    "persistSession": false,
    "parallel": false,
    "timeout": 300,
    "tests": ["bb7c6235-c719-4044-9244-0973b70d602e"]
  }],
  "urls": ["https://www.tops-int.com/"],
  "plugins": []
}