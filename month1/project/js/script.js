const blogs = [
    {
        
        title: "title edweded",
        body: "lorem "
    },
    {
        title: "title ",
        body: "lorem "
    },
    {
        title: "title ",
        body: "lorem "
    },
    {
        title: "title ",
        body: "lorem "
    },
    {
        title: "title ",
        body: "loremcefwewfewf "
    },
];

const mainElement = document.getElementsByTagName("main")[0];

for (let i = 0; i < blogs.length; i++) {
  const blog = blogs[i];

  const title = document.createElement("h1");
  const body = document.createElement("p");

  title.textContent = blog.title;
  body.textContent = blog.body;

  mainElement.append(title, body);
}