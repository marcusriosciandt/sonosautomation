Feature: General Information
	I want to validate session general information and if exist some field to send to ICS

@test1
Scenario: Validate mandatory fields subsection General Information
		Given I am a partner
		And I access session General Information
		And I dont fill the fields
		When I try to save
		Then valid that there is mandatory fields

Scenario: Validate mandatory field subsection WebSite
		Given I am a partner
		And I access subsection WebSite #implementar
		And I dont fill the fields
		When I try to save
		Then valid that there is mandatory fields in the session WebSite #implementar

Scenario: Validate subsection General Information successfully saved

Scenario: Validate subsection WebSite successfully saved

#Validar os campos da subsessao WEBSITE que sao enviados para o ICS
Scenario: Validate that Facebook and Twitter fields going to ICS

Scenario: Validate subsection General Information unsaved

Scenario: Validate subsection WebSite Information unsaved

Scenario: Validate that General Information has been submitted






