<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Form</title>

    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css" rel="stylesheet">

    <style>
        body {
            padding-top: 30px;
            background: #f9f9f9;
            font-family: 'Roboto', sans-serif;
            font-size: 14px;
        }
        .content-area {
            padding: 15px;
        }
        .dashboard-card {
            border: none;
            border-radius: 10px;
            overflow: hidden;
            box-shadow: 0 3px 10px rgba(0, 0, 0, 0.1);
        }
        .dashboard-card-header {
            background-color: #D19C97;
            color: white;
            text-align: center;
            padding: 10px;
            font-size: 18px;
            font-weight: bold;
        }
        .dashboard-card-body {
            padding: 15px;
            background-color: white;
        }
        .form-label {
            font-size: 13px;
        }
        .form-control {
            height: calc(1.5em + 0.5rem + 2px);
            padding: 0.25rem 0.5rem;
            font-size: 13px;
        }
        .btn-block {
            margin-bottom: 10px;
            font-size: 13px;
            text-transform: uppercase;
            background-color: #D19C97;
            color: white;
            border: none;
            padding: 6px 12px;
        }
        .btn-block:hover {
            background-color: #b58480;
        }
        .navbar {
            background-color: #D19C97;
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
    <div class="card dashboard-card">
        <div class="dashboard-card-header">
            Product Update Form
        </div>
        <div class="dashboard-card-body">
            <form action="products-update" method="post">
                <div class="mb-2">
                    <label for="id" class="form-label">ID:</label>
                    <input type="text" class="form-control" id="id" name="id">
                </div>
                <div class="mb-2">
                    <label for="name" class="form-label">Name:</label>
                    <input type="text" class="form-control" id="name" name="name">
                </div>
                <div class="mb-2">
                    <label for="price" class="form-label">Price:</label>
                    <input type="text" class="form-control" id="price" name="price">
                </div>
                <div class="mb-2">
                    <label for="qty" class="form-label">Quantity:</label>
                    <input type="text" class="form-control" id="qty" name="qty">
                </div>
                <div class="mb-2">
                    <label for="productImage" class="form-label">Product Image:</label>
                    <input type="text" class="form-control" id="productImage" name="productImage">
                </div>
                <button type="submit" class="btn btn-block">Update Product</button>
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
