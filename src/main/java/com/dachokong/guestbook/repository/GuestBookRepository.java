package com.dachokong.guestbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dachokong.guestbook.domain.GuestBook;

public interface GuestBookRepository extends JpaRepository<GuestBook, Integer> {

}
