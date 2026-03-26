package com.adacho.guestbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adacho.guestbook.domain.GuestBook;

public interface GuestBookRepository extends JpaRepository<GuestBook, Integer> {

}
