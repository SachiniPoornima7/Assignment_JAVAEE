<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Delete Product</title>

    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-color: #f8f9fa;
            font-family: 'Roboto', sans-serif;
            font-size: 14px;
        }
        .container {
            margin-top: 50px;
            max-width: 400px;
        }
        .card {
            border: none;
            border-radius: 10px;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.1);
        }
        .card-header {
            background-color: #dc3545;
            color: white;
            text-align: center;
            padding: 15px;
            font-size: 18px;
            font-weight: bold;
        }
        .form-label {
            font-size: 13px;
        }
        .form-control {
            height: calc(1.5em + 0.5rem + 2px);
            padding: 0.25rem 0.5rem;
            font-size: 13px;
        }
        .btn-danger {
            background-color: #dc3545;
            border: none;
            width: 100%;
            text-transform: uppercase;
            font-size: 14px;
        }
        .btn-danger:hover {
            background-color: #bd2130;
        }
    </style>
</head>
<body>
<div class="row align-items-center py-3 px-xl-5">
    <div class="col-lg-3 d-none d-lg-block">
        <a href="AdminDash.jsp" class="text-decoration-none">
            <h1 class="m-0 display-5 font-weight-semi-bold"><span class="text-primary font-weight-bold border px-3 mr-1">Sachi</span>Shopper</h1>
        </a>
    </div>

</div>

<div class="container">
    <div class="card">
        <div class="card-header">
            Delete Product
        </div>
        <div class="card-body">
            <form action="products-delete" method="post">
                <div class="mb-3">
                    <label for="id" class="form-label">Product ID:</label>
                    <input type="text" class="form-control" id="id" name="id" placeholder="Enter Product ID" required>
                </div>
                <button type="submit" class="btn btn-danger">Delete Product</button>
            </form>
        </div>
    </div>
</div>

<!-- Bootstrap JS and dependencies -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
