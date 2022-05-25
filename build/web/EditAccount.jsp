<%-- 
    Document   : EditAccount
    Created on : Mar 7, 2022, 10:11:36 PM
    Author     : trinh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!--Favicon-->
        <!--<link rel="icon" type="image/png" href="image/faviconLogo.png" />-->
        <title>Update Account</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="css/edit.css">
        <script>

        </script>
    </head>
    <body>

        <!-- Edit Product -->
        <div id="editEmployeeModal">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="editAccount2" method="post">
                        <div class="modal-header">						
                            <h4 class="modal-title">Edit Account</h4>
                            <a type="button" class="close" href="managerAccount" aria-hidden="true">&times;</a>
                        </div>
                        <div class="modal-body">					
                            <div class="form-group">
                                <label>ID</label>
                                <input value="${EditAccount.id}" name="id" type="text" class="form-control" required readonly>
                            </div>
                            <div class="form-group">
                                <label>User</label>
                                <input value="${EditAccount.user}" name="user" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Pass Word</label>
                                <input value="${EditAccount.pass}" name="pass" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Email</label>
                                <input value="${EditAccount.email}" name="email" type="text" class="form-control" required>
                            </div>
                            <c:if test="${EditAccount.id==4}">
                                <div class="form-group">
                                    <label>Sell (Enter '0' is User; '1' is is Sell)</label>
                                    <input name="isSell" type="text" class="form-control" readonly="">
                                </div>
                                <div class="form-group">
                                    <label>Admin (Enter '0' is User; '1' is is Admin)</label>
                                    <input name="isAdmin" type="text" class="form-control" readonly="">
                                </div>
                            </c:if>
                            <c:if test="${EditAccount.id!=4}">
                                <div class="form-group">
                                    <label>Sell (Enter '0' is User; '1' is is Sell)</label>
                                    <input value="${EditAccount.isSell}" name="isSell" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Admin (Enter '0' is User; '1' is is Admin)</label>
                                <input value="${EditAccount.isAdmin}" name="isAdmin" type="text" class="form-control" required>
                            </div>
                            </c:if>
                        </div>
                        <div class="modal-footer">
                            <a type="button" class="btn btn-default" href="managerAccount">Cancel</a>
                            <input type="submit" class="btn btn-info" value="Save">
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
