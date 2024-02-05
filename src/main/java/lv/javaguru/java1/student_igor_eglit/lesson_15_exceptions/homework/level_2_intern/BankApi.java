package lv.javaguru.java1.student_igor_eglit.lesson_15_exceptions.homework.level_2_intern;

import java.util.Optional;

interface BankApi {
    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws NoRoleCanSearchClient;

}

