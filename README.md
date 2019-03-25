**Grocerry App**

This is an sample springboot application with simple CRUD which uses Apache Derby 
for data persistance.

**APIs**

**List All:**

`curl -i -X GET \
 'http://localhost:8090/shoppinglists'`
 
 **List** 
 
 `curl -i -X GET \
  'http://localhost:8090/shoppinglist/16'
 ` 
 
 **Create:**
 
`curl -i -X POST \
   -H "Content-Type:application/json" \
   -d \
'{"title": "test", "shoppingListId": "16"}' \
 'http://localhost:8090/shoppinglist'`
 
  **Update:**
  
`
 curl -i -X PUT \
    -H "Content-Type:application/json" \
    -d \
 '{"title": "updatedShop", "shoppingListId": "16"}' \
  'http://localhost:8090/shoppinglist'`
   
   
**Delete:**

`   
curl -i -X DELETE \
 'http://localhost:8090/shoppinglist/16'`
