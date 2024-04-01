from pymongo import MongoClient

# Replace the connection string below with your MongoDB Atlas connection string
# Make sure to replace <password> and <dbname> with your actual password and database name
# You can find this connection string in your MongoDB Atlas dashboard
# Example: "mongodb+srv://username:password@clustername.mongodb.net/<dbname>?retryWrites=true&w=majority"
connection_string = "mongodb+srv://ashan:ashan@cluster0.jkjpbuh.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0"

# Connect to MongoDB Atlas
client = MongoClient(connection_string)

# Access the database "computer_shop"
db = client["computer_shop"]

# Create a collection called "Ram_stocks" (if it doesn't exist already)
ram_stocks_collection = db["Ram_stocks"]

# Create a document to insert
ram_data = {
    "type": "4GB",
    "price": 50
}

# Insert the document into the collection
ram_stocks_collection.insert_one(ram_data)

print("Document inserted successfully.")
