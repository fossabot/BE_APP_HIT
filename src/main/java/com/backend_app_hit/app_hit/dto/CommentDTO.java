package com.backend_app_hit.app_hit.dto;

public class CommentDTO {
  private Long postId;
  private String comment;

  
  public CommentDTO() {
  }


  public CommentDTO(Long postId, String comment) {
    this.postId = postId;
    this.comment = comment;
  }


  public Long getPostId() {
    return postId;
  }


  public void setPostId(Long postId) {
    this.postId = postId;
  }


  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }

}
