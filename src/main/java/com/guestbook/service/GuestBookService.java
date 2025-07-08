package com.guestbook.service;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.guestbook.entity.GuestBook;
import com.guestbook.repository.GuestBookRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GuestBookService {
	private final GuestBookRepository guestBookRepository;
	
	public void addPost(GuestBook book) throws DataAccessException {
		guestBookRepository.save(book);
	}
	
	public List<GuestBook> listBooks() throws DataAccessException {
		List<GuestBook> bookList = guestBookRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
		return bookList;
	}
}
