package baeza.guillermo.monkeyapp.login.domin

import baeza.guillermo.monkeyapp.login.data.LoginRepository

class LoginUseCase {
    private val repository = LoginRepository()

    suspend operator fun invoke(user: String, password: String): Boolean {
        return repository.doLogin(user, password)
    }
}