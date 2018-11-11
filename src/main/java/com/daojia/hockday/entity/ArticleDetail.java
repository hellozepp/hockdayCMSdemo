package com.daojia.hockday.entity;

import java.util.Date;

public class ArticleDetail {
    private Long id;

    private Long authorId;

    private String authorName;

    private String authorPhoto;

    private String title;

    private String articleContent;

    private Integer viewNum;

    private Integer likeNum;

    private Integer commentNum;

    private Date createTime;

    public ArticleDetail(Long id, Long authorId, String authorName, String authorPhoto, String title, String articleContent, Integer viewNum, Integer likeNum, Integer commentNum, Date createTime) {
        this.id = id;
        this.authorId = authorId;
        this.authorName = authorName;
        this.authorPhoto = authorPhoto;
        this.title = title;
        this.articleContent = articleContent;
        this.viewNum = viewNum;
        this.likeNum = likeNum;
        this.commentNum = commentNum;
        this.createTime = createTime;
    }

    public ArticleDetail() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName == null ? null : authorName.trim();
    }

    public String getAuthorPhoto() {
        return authorPhoto;
    }

    public void setAuthorPhoto(String authorPhoto) {
        this.authorPhoto = authorPhoto == null ? null : authorPhoto.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }

    public Integer getViewNum() {
        return viewNum;
    }

    public void setViewNum(Integer viewNum) {
        this.viewNum = viewNum;
    }

    public Integer getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}