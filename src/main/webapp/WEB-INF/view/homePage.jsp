<!DOCTYPE html>
<html>
<head>
    <title>Products List</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-bottom: 20px;
        }

        table, th, td {
            border: 1px solid #ddd;
        }

        th, td {
            padding: 12px;
            text-align: left;
        }

        th {
            background-color: #333;
            color: #fff;
        }

        .btn {
            padding: 8px 16px;
            border: none;
            border-radius: 4px;
            color: #fff;
            cursor: pointer;
        }

        .btn-view {
            background-color: #007bff;
        }

        .btn-update {
            background-color: #ffc107;
        }

        .btn-delete {
            background-color: #dc3545;
        }

    </style>
</head>
<body>
<h1>Products Data</h1>
<table>
    <thead>
    <tr>
        <th>#</th>
        <th>Name</th>
        <th>Show Details</th>
        <th>Add/Update</th>
        <th>Delete</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>1</td>
        <td>milk</td>
        <td>
            <button class="btn btn-view">View Details</button>
        </td>
        <td>
            <button class="btn btn-update">Add/update Details</button>
        </td>
        <td>
            <button class="btn btn-delete">Delete</button>
        </td>
    </tr>
    <tr>
        <td>2</td>
        <td>fish</td>
        <td>
            <button class="btn btn-view">View Details</button>
        </td>
        <td>
            <button class="btn btn-update">Add/update Details</button>
        </td>
        <td>
            <button class="btn btn-delete">Delete</button>
        </td>
    </tr>
    <tr>
        <td>3</td>
        <td>cheese</td>
        <td>
            <button class="btn btn-view">View Details</button>
        </td>
        <td>
            <button class="btn btn-update">Add/update Details</button>
        </td>
        <td>
            <button class="btn btn-delete">Delete</button>
        </td>
    </tr>
    <tr>
        <td>4</td>
        <td>chocolate</td>
        <td>
            <button class="btn btn-view">View Details</button>
        </td>
        <td>
            <button class="btn btn-update">Add/update Details</button>
        </td>
        <td>
            <button class="btn btn-delete">Delete</button>
        </td>
    </tr>
    </tbody>
</table>
<div class="text-center mt-3">
    <a href="add-product" class="btn btn-success"
       style="background-color: green; border-color: green; text-decoration: none;">Add Product</a>

</div>
</body>
</html>