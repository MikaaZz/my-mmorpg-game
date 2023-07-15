const express = require('express');
const app = express();
const port = 5000; // you can choose another port if this is occupied

app.get('/', (req, res) => {
    res.send('Hello, world!');
});

app.listen(port, () => {
    console.log(`Server running at http://localhost:${port}`);
});
