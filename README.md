# Mobo-Bank
This Project mocks a fullstack  bank api that lets customer to get their balances. The application is build on Java spring boot as the api stack and React , next js as the client stack.
Mobo-Bank
This Project mocks a fullstack bank api that lets customer to get their balances. The application is build on Java spring boot as the api stack and React , next js as the client stack.

To start the application, run the MoboBank application first on localhost. To test the application api - post this payload { "transaction_reference":"MP90023", "transaction_code": "BIMM", "amount": 0, "narration": "Payment for order 8923", "phone_number": "254706215505" } on this api endpoint http://localhost:5000/mobo/api/v1/get-balance. if it successfully started you will receive this response { "transaction_reference": "MP90023", "transaction_code": "BIMM", "amount": "0", "narration": "Payment for order 8923", "phone_number": "254706215505", "actual_balance": 500, "available_balance": 500 }

once the api has started proceed to start the client application.

Navigate to the root dir of Moba Portal and open a terminal. Run npm run dev to start the application.

The application should launch on http://localhost:3000/

Good Luck😊
