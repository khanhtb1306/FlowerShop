<%-- 
    Document   : EditInfo
    Created on : Mar 15, 2022, 9:05:49 PM
    Author     : trinh
--%>

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
                    <form action="editinfo" method="post">
                        <div class="modal-header">						
                            <h4 class="modal-title">Change Profiles</h4>
                            <a type="button" class="close" href="User?check=1" aria-hidden="true">&times;</a>
                        </div>
                        <div class="modal-body">					
                            <div class="form-group">
                                <label>User Name</label>
                                <input value="${acc.user}" name="user" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Email</label>
                                <input value="${acc.email}" name="email" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Adress</label>
                                <input value="${info.address}" name="address" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Phone Number</label>
                                <input value="${info.phone}" name="phone" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Description</label>
                                <input value="${info.description}" name="des" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Avatar</label>
                                <input value="${info.image}" name="image" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>FullName</label>
                                <input value="${info.fullName}" name="fname" type="text" class="form-control" required>
                            </div>

                        </div>
                        <div class="modal-footer">
                            <a type="button" class="btn btn-default" href="User?check=1">Cancel</a>
                            <input type="submit" class="btn btn-info" value="Save">
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
