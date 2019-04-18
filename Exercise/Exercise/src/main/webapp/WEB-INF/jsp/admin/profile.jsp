<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<c:import url="/WEB-INF/jsp/admin/admin-common/admin-header.jsp"/>

<div id="profile-view">
<div class="body-main-container">

<div class="main-container user-overview">
                  <h2>User details</h2>
                  <div class="user-overview-block">
                    <div class="user-image-container">
                      <div class="user-image-subcontainer">
                        <img src="https://i.ytimg.com/vi/nuq8CSLOzHw/maxresdefault.jpg" class="user-image">
                      </div>
                    </div>
                    <div class="user-details">
                      <div class="detail-column column-1">
                        <div class="detail-row username">
                          <div class="detail-question">Username</div>
                          <div class="detail-answer">salomondrin</div>
                        </div>
                        <div class="detail-row fullname">
                          <div class="detail-question">Full Name</div>
                          <div class="detail-answer">Alejandro Salomon</div>
                        </div>
                        <div class="detail-row email">
                          <div class="detail-question">Email</div>
                          <div class="detail-answer">info@salomondrin.com</div>
                        </div>
                      </div>
                      <div class="detail-column column-2">
                        <div class="detail-row badges">
                          <div class="detail-question">Badges</div>
                          <div class="detail-answer"><span class="user-badge admin">Admin</span><span class="user-badge pro">Pro</span><span class="user-badge mod">Mod</span></div>
                        </div>
                        <div class="detail-row member-date">
                          <div class="detail-question">Member Since</div>
                          <div class="detail-answer">12-07-2015</div>
                        </div>
                        <div class="detail-row points">
                          <div class="detail-question">Points</div>
                          <div class="detail-answer">23,516 (yearly) / 1,897 (weekly)</div>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div class="edit-user-actions">
                    <div class="button-container">
                      <button class="make-user-pro">Make Pro Member</button>
                    </div>
                    <div class="button-container">
                      <button class="make-user-pro">Make Moderator</button>
                    </div>
                    <div class="button-container">
                      <button class="reset-password">Reset Password</button>
                    </div>
                    <div class="button-container">
                      <button class="make-user-troll">Troll</button>
                    </div>
                    <div class="button-container">
                      <button class="delete">Delete</button>
                    </div>
                  </div>
                </div>
                <div class="main-container latest-posts">
                  <h2>Latest posts from this user</h2>
                  <div class="posts-block">
                    <div class="single-post image">
                      <div class="post-thumbnail-container">
                        <img src="https://i.ytimg.com/vi/nuq8CSLOzHw/maxresdefault.jpg" class="post-thumbnail">
                      </div>
                      <div class="post-details">
                        <p class="post-type">Image</p>
                        <p class="post-title">Look what Alejandro and Farshad did today!</p>
                      </div>
                      <div class="post-actions">
                        <div class="button-container">
                          <button class="edit-post">Edit</button>
                        </div>
                        <div class="button-container">
                          <button class="delete">Delete</button>
                        </div>
                      </div>
                    </div>
                    <div class="single-post video">
                      <div class="post-thumbnail-container">
                        <img src="https://i.ytimg.com/vi/nuq8CSLOzHw/maxresdefault.jpg" class="post-thumbnail">
                      </div>
                      <div class="post-details">
                        <p class="post-type">Video</p>
                        <p class="post-title">Look what Alejandro and Farshad did today!</p>
                      </div>
                      <div class="post-actions">
                        <div class="button-container">
                          <button class="edit-post">Edit</button>
                        </div>
                        <div class="button-container">
                          <button class="delete">Delete</button>
                        </div>
                      </div>
                    </div>
                    <div class="single-post blog">
                      <div class="post-thumbnail-container">
                        <img src="https://i.ytimg.com/vi/nuq8CSLOzHw/maxresdefault.jpg" class="post-thumbnail">
                      </div>
                      <div class="post-details">
                        <p class="post-type">Blog Post</p>
                        <p class="post-title">Look what Alejandro and Farshad did today!</p>
                      </div>
                      <div class="post-actions">
                        <div class="button-container">
                          <button class="edit-post">Edit</button>
                        </div>
                        <div class="button-container">
                          <button class="delete">Delete</button>
                        </div>
                      </div>
                    </div>
                    <div class="single-post podcast">
                      <div class="post-thumbnail-container">
                        <img src="https://i.ytimg.com/vi/nuq8CSLOzHw/maxresdefault.jpg" class="post-thumbnail">
                      </div>
                      <div class="post-details">
                        <p class="post-type">Podcast</p>
                        <p class="post-title">Look what Alejandro and Farshad did today!</p>
                      </div>
                      <div class="post-actions">
                        <div class="button-container">
                          <button class="edit-post">Edit</button>
                        </div>
                        <div class="button-container">
                          <button class="delete">Delete</button>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
                <div class="main-container latest-comments">
                  <h2>Latest comments from this user</h2>
                  <div class="comments-block">
                    <div class="single-comment">
                      <div class="comment-details">
                        <a class="comment-post" href="#">We bought the last Raptor!</a>
                        <p class="comment-text">Sucks for everyone else! The next Raptor will be available in 3 months.</p>
                        <p class="comment-timestamp">February 19th, 2018 at 18:36pm</p>
                      </div>
                      <div class="comment-actions">
                        <div class="button-container">
                          <button class="delete">Delete</button>
                        </div>
                      </div>
                    </div>
                    <div class="single-comment">
                      <div class="comment-details">
                        <a class="comment-post" href="#">We bought the last Raptor!</a>
                        <p class="comment-text">Sucks for everyone else! The next Raptor will be available in 3 months.</p>
                        <p class="comment-timestamp">February 19th, 2018 at 18:36pm</p>
                      </div>
                      <div class="comment-actions">
                        <div class="button-container">
                          <button class="delete">Delete</button>
                        </div>
                      </div>
                    </div>
                    <div class="single-comment">
                      <div class="comment-details">
                        <a class="comment-post" href="#">We bought the last Raptor!</a>
                        <p class="comment-text">Sucks for everyone else! The next Raptor will be available in 3 months.</p>
                        <p class="comment-timestamp">February 19th, 2018 at 18:36pm</p>
                      </div>
                      <div class="comment-actions">
                        <div class="button-container">
                          <button class="delete">Delete</button>
                        </div>
                      </div>
                    </div>
                    <div class="single-comment">
                      <div class="comment-details">
                        <a class="comment-post" href="#">We bought the last Raptor!</a>
                        <p class="comment-text">Sucks for everyone else! The next Raptor will be available in 3 months.</p>
                        <p class="comment-timestamp">February 19th, 2018 at 18:36pm</p>
                      </div>
                      <div class="comment-actions">
                        <div class="button-container">
                          <button class="delete">Delete</button>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>

</div>
</div>

<style>
.user-overview-block {
        display: flex;
        align-items: center;
        padding: 10px 0px 22px 0px;
      }
      .user-image-subcontainer {
        position: relative;
        width: 100px;
        height: 100px;
        border-radius: 50%;
        overflow: hidden;
        display: flex;
        justify-content: center;
      }
      .user-image {
        height: 100%;
        width: auto;
        max-width: none;
      }
      .user-details {
        display: flex;
        flex-wrap: wrap;
      }
      .detail-column {
        display: table;
      }
      .detail-row {
        display: table-row;
      }
      .detail-row > div {
        display: table-cell;
        padding: 4px 5px;
      }
      .detail-column.column-1 {
        margin-right: 10px;
      }
      .detail-question {
        font-size: 0.9em;
        color: #a1a1a1;
        text-transform: uppercase;
        text-align: right;
        min-width: 110px;
      }
      .user-badge {
        font-size: 0.6em;
        text-transform: uppercase;
        margin-right: 3px;
        color: white;
        padding: 3px 5px;
        border-radius: 3px;
      }
      .user-badge.admin {
        background: #0FA2F1;
      }
      .user-badge.pro {
        background: black;
      }
      .user-badge.mod {
        background: #18CD15;
      }
      .edit-user-actions {
        display: flex;
      }
      .edit-user-actions button {
        padding: 8px 12px;
        margin-right: 5px;
      }
      .posts-block {
        padding-top: 5px;
        margin-bottom: -12px;
      }
      .single-post {
        display: flex;
        border: 1px solid rgba(0, 0, 0, .12);
        border-radius: 5px;
        padding: 10px 20px 10px 10px;
        margin-bottom: 12px;
      }
      .post-thumbnail-container {
        width: 100%;
        max-width: 200px;
        height: 100%;
        max-height: 112px;
        overflow: hidden;
      }
      .post-thumbnail {
        max-width: 100%;
        max-height: 100%;
      }
      .post-details {
        width: 100%;
        padding: 10px 15px;
      }
      .post-type {
        font-weight: 700;
        text-transform: uppercase;
        padding-bottom: 5px;
      }
      .single-post.image .post-type {
        color: #4286f4;
      }
      .single-post.video .post-type {
        color: #f39606;
      }
      .single-post.blog .post-type {
        color: #f44236;
      }
      .single-post.podcast .post-type {
        color: #18cd15;
      }
      .post-title {
        font-size: 1.2em;
        font-weight: 700;
        letter-spacing: -0.035em;
      }
      .post-actions {
        margin: auto 0;
        text-align: center;
      }
      .posts-block button.delete {
        margin-top: 5px;
      }
      .comments-block {
        padding-top: 5px;
        margin-bottom: -10px;
      }
      .single-comment {
        display: flex;
        align-items: center;
        border: 1px solid rgba(0, 0, 0, .12);
        border-radius: 5px;
        padding: 12px 20px;
        margin-bottom: 10px;
      }
      .comment-details {
        width: 100%;
        padding-right: 10px;
      }
      .comment-post {
        font-size: 1.2em;
        font-weight: 700;
      }
      .comment-text {
        font-style: italic;
        padding: 7px 0px;
      }
      .comment-timestamp {
        color: #a1a1a1;
        font-size: 0.8em;
      }
      @media (max-width: 480px) {
        .edit-user-actions {
          flex-wrap: wrap;
        }
        .edit-user-actions button {
          margin-bottom: 5px;
        }
        .single-post {
          flex-direction: column;
          padding: 10px;
        }
        .post-thumbnail-container {
          max-width: none;
          max-height: none;
        }
        .post-details {
          width: auto;
          padding: 8px 5px 15px;
        }
        .post-type {
          padding-bottom: 2px;
        }
        .post-actions {
          display: flex;
        }
        .posts-block button.delete {
          margin: 0px 0px 0px 5px;
        }
      }

</style>
<c:import url="/WEB-INF/jsp/admin/admin-common/admin-fotter.jsp"/>
