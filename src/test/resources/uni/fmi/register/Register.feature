Feature: Регистрация на потребител

  Scenario Outline: Регистрация на потребител
    Given Потребителя отваря екрана за регистрация
    When Въведе потребителско име "<username>"
    And Въведе парола "<password>" в полето парола
    And Въведе парола "<password2>" в полетао за втора парола
    And Въведе адрес за електронна поща "<email>"
    And Натиска бутона за регистрация
    Then Вижда съобщение "<message>"

    Examples: 
      | username  |  password | password2  |   email       |   message                    |
      | ivan      |Pass124345!| Pass124345!|ivan@abv.bg    | Регистрирахте се успешно!    |
      |           |Pass124345!| Pass124345!|ivan@abv.bg    | Въведете потребителско име!  |
      | ivan      |Pass124345!| Pass124345!|not valid Email| Невалидна електронн апоща!   |
      | ivan      |Pass124345!| Pass124345!|               | Невалидна електронн апоща!   |
      | ivan      |Pass       | Pass       |ivan@abv.bg    | Паролата трябва да е по-дълга от четери синвола!    |
      | ivan      |           |            |ivan@abv.bg    | Паролата трябва да е по-дълга от четери синвола!    |
      | ivan      |Pass124345!| 124345!Pass|ivan@abv.bg    | Въведете еднакви пароли!     |
      | ivan123   |Pass124345!| Pass124345!|ivan123@abv.bg | Потребителското име е заето! |
