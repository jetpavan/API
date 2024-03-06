Feature: Validate the response of Post method of petstore

  @addUser
  Scenario: Verify if the user is being successfully created using addUserAPi
    Given I add user payload
    When I call "addUserAPI" with "post" http request
    Then I get API call success with status code 200

  @getUser
  Scenario: Verify if get user functionality is working
    Given I get user payload
    When I call "getUserAPI" with "get" http request
    Then I get API call success with status code 200
