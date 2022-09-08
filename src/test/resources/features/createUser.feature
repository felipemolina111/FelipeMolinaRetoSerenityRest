Feature:  Create user service
  Scenario:  Successful creation of a user in petStore
    Given  A user send the request to create a new user in the endpoint "https://petstore.swagger.io/v2/user"
      | id        | 13                     |
      | username  | fmolina                |
      | firstName | felipe                 |
      | lastName  | molina                 |
      | email     | pipemoli9611@gmail.com |
      | password  | 12345678               |
      | phone     | 3165188144             |
      | status    | 0                      |


    Then Validate that the status code is 200
    And Validate that the response contains the key "type" must be "unknown"
    And Validate that the response  "message" must be "13"
