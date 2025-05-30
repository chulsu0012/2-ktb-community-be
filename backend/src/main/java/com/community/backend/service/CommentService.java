package com.community.backend.service;

import com.community.backend.dto.CommentDTO;
import com.community.backend.dto.CommentRequest;

import java.util.List;

public interface CommentService {
    List<CommentDTO> getCommentList(Long postId);
    Long save(Long userId, Long postId, CommentRequest req);
    Long update(Long userId, Long commentId, CommentRequest req);
    void delete(Long userId, Long commentId);
}
