const jsonServer = require('json-server');
const server = jsonServer.create();
const router = jsonServer.router('db.json');
const middlewares = jsonServer.defaults();

const PORT = 8083;

// Use default middlewares (logger, static, cors, no-cache)
server.use(middlewares);

// Rewrite routes so /api/keynotes maps to /keynotes
server.use(
  jsonServer.rewriter({
    '/api/keynotes*': '/keynotes$1'
  })
);

server.use(router);

server.listen(PORT, () => {
  console.log(`✅  Keynote Mock Server is running on http://localhost:${PORT}`);
  console.log(`   GET  http://localhost:${PORT}/api/keynotes        -> all keynotes`);
  console.log(`   GET  http://localhost:${PORT}/api/keynotes/:id    -> keynote by id`);
  console.log(`   POST http://localhost:${PORT}/api/keynotes        -> create keynote`);
  console.log(`   PUT  http://localhost:${PORT}/api/keynotes/:id    -> update keynote`);
  console.log(`   DEL  http://localhost:${PORT}/api/keynotes/:id    -> delete keynote`);
});
