# js-state-machine-v2

This project is a JavaScript framework for UI applications. Uses jQuery to illustrate the framework. This front end is integrated with a Spring Boot API.

This project extends the state machine developed in [js-state-machine](https://github.com/mapteb/js-state-machine) to use server models.

The complete source for this framework is in one [html](https://raw.githubusercontent.com/mapteb/js-state-machine-v2/master/src/main/resources/static/jqStateMachine.html).

To demo this project import it into an IDE like [STS](https://spring.io/tools) as a Gradle Spring Boot application. When the server is started access http://localhost:8080/jqStateMachine.html

The following state transitions can be tested.

| Initial State | Pre-Event | Process | Post-Event | Final State |
| --- | --- | --- | --- | --- |
| defaultState -> | coinEvent -> | handleCoin() -> | coinSuccessEvent -> | coinSuccessState |
| defaultState -> | coinEvent -> | handleCoin() -> | coinErrorEvent -> | coinErrorState |
| coinErrorState -> | coinEvent -> | handleCoin() -> | coinSuccessEvent -> | coinSuccessState |
| coinSuccessState -> | pushEvent -> | handlePush() -> | pushSuccessEvent -> |pushSuccessState |

In the previous version validation of the coin amount was done in the client side. In this version the validation is performed in the server to illustrate the integration of the JavaScript framework with server models.

More information on this project is available <https://dzone.com/articles/a-javascript-framework-for-robust-ui-applications>.

## Related Projects

An alternative verson of this project that uses web components instead of jquery is at: https://github.com/mapteb/state-transitions-with-webcomponents