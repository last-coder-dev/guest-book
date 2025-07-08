package com.guestbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guestbook.entity.GuestBook;

public interface GuestBookRepository extends JpaRepository<GuestBook, Integer>{

}
