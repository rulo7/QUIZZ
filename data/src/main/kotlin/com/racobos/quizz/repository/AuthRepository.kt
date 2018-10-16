package com.racobos.quizz.repository

import com.racobos.quizz.datasource.FirebaseAuthDataSource
import com.racobos.quizz.datasource.FirebaseRealDatabaseDataSource
import com.racobos.quizz.datasource.FirestoreDataSource
import com.racobos.quizz.entity.UserEntity
import io.reactivex.Observable
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton

interface AuthRepository {
    fun login(): Single<String>
    fun getUser(): Observable<UserEntity>
}

@Singleton
class AuthDataRepository
@Inject
constructor(
    firebaseRealDatabaseDataSource: FirebaseRealDatabaseDataSource,
    firestoreDataSource: FirestoreDataSource,
    firebaseAuthDataSource: FirebaseAuthDataSource
) : AuthRepository {
    override fun login(): Single<String> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getUser(): Observable<UserEntity> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}