# js-state-machine-v2
This project extends the state machine developed in [js-state-machine](https://github.com/mapteb/js-state-machine) to use server models.

Uses jQuery to illustrate the framework.

To demo this project import into an IDE like [STS](https://spring.io/tools) as a Gradle Spring Boot application. When started access http://localhost:8080/jqStateMachine.html

The following state transitions can be tested.
<br />
`    defaultState     -  coinEvent -> handleCoin() - coinSuccessEvent - coinSuccessState`<br />
`    defaultState     -  coinEvent -> handleCoin() - coinErrorEvent   - coinErrorState`<br />
`    coinErrorState   -  coinEvent -> handleCoin() - coinSuccessEvent - coinSuccessState`<br />
`    coinSuccessState -  pushEvent -> handlePush() - pushSuccessEvent - pushSuccessState`<br />

In the previous version validation of the coin amount was done in the client side. In this version the validation is performed in the server.

