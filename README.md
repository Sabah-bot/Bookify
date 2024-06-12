# To Do List (Bookshelf) - Backend Project

## Summary
The to-do list will have three models, User, Book and Bookshelf. A user can create personalised bookshelves (lists) tailored to a specific theme. For example,  “Holiday Reads”, “Textbook’s for next year”, “Sorting my life together” which could be a collection of self-help books. Within these bookshelves are book objects (to-do) that the user can add, update, remove and provide details. Such as title, author, genre…

This system allows the user access to their bookshelves and associated books. It would include fields or attributes to indicate the status of each book (e.g., whether it's been read, is currently being read, or is intended for future reading) and potentially a priority level. Users could then categorise their books accordingly, helping them track their reading progress and prioritise their reading list effectively.
## MVP

### Models:
- Book: Represents a book with properties such as title, author, ISBN, publication year, genre, and rating.
- Bookshelf: Represents a user's bookshelf, which contains a list of books.
- User: Represents a user who owns the bookshelf and can add many books to their bookshelf, as a list. Users can have multiple bookshelves.

### Bookshelf

| Endpoints        | URLs           | Description  |
| :-------------: |:-------------:| :-----:|
| GET      | /users/{id}| Retrieve user’s associated bookshelves |
| SHOW   | /bookshelves/{id} |  Retrieve a specific bookshelf |
| CREATE/POST | /bookshelves| Create a new bookshelf |
|PATCH | /bookshelves/{id} | Add book to existing bookshelf|
| UPDATE/PATCH | /bookshelves/{id} | Update the name of a specific bookshelf |
|DELETE |/bookshelves/{id}|Delete bookshelf by bookshelf_id (this will be mapped by the value = “bookshelves_id”)|
|DELETE |/bookshelves/{id}/books/{id}|Delete specific book from a bookshelf|

### Book

| Endpoints        | URLs           | Description  |
| :-------------: |:-------------:| :-----:|
| INDEX/GET/ | /books | Get all books in all the collections (this could be something in the extension as a family plan) |
| SHOW | /books/{id} | Retrieve a specific book by its ID |
| INDEX | /books | Retrieve all books |
| ~~UPDATE/PUT~~ | ~~/books/{id}~~ | ~~Update the details of a specific book~~ |
|**DELETE**|**/books/{id}**| **Delete a specific book** |


### User

| Endpoints        | URLs           | Description  |
| :-------------: |:-------------:| :-----:|
| GET | /users | Retrieve users|
| GET| /users/{id}| Get user by id |
|PUT | /users/{id} | Update the details of a specific user|
|POST|/users | Create a new user |
|DELETE|/users/{id}| Delete a specific user |

### UsersBooks
| Endpoints        | URLs           | Description  |
| :-------------: |:-------------:| :-----:|
| UPDATE/PATCH | /books/{id} | Update reading status |

## Extensions
