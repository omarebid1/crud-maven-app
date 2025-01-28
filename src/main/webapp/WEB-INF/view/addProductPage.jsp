<!DOCTYPE html>
<html>
<head>
    <title>Add Product</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }

        form {
            max-width: 400px;
            margin: auto;
            border: 1px solid #ddd;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }

        h1 {
            text-align: center;
            margin-bottom: 20px;
        }

        label {
            font-weight: bold;
            display: block;
            margin-bottom: 5px;
        }

        input[type="text"], input[type="number"], input[type="date"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            background-color: #007bff;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
            display: block;
            width: 100%;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<form action="addProductServlet" method="post">
    <h1>Add Product</h1>
    <label for="productName">Product Name</label>
    <input type="text" id="productName" name="productName" placeholder="Enter product name" required>

    <label for="expirationDate">Expiration Date</label>
    <input type="text" id="expirationDate" name="expirationDate" placeholder="dd/mm/yyyy" required>

    <label for="manufacturer">Manufacturer</label>
    <input type="text" id="manufacturer" name="manufacturer" placeholder="Manufacturer" required>

    <label for="price">Price</label>
    <input type="number" id="price" name="price" placeholder="Price" step="0.01" required>

    <label for="availability">Availability</label>
    <input type="number" id="availability" name="availability" placeholder="0 or 1" min="0" max="1" required>

    <input type="submit" value="Submit">
</form>
</body>
</html>

