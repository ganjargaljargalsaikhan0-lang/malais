// const blogs = [
//     {
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

const API_URL = "https://jsonplaceholder.typicode.com/posts";

const mainElement = document.getElementsByTagName("main")[0];
const input = document.querySelector(".input");

let allData = []; // бүх пост хадгална

async function getData() {
  try {
    const response = await fetch(API_URL);
    if (!response.ok) throw new Error(`HTTP error! Status: ${response.status}`);
    
    const data = await response.json();
    console.log(data);

    allData = data; // хадгална

    // ЭХНИЙ УДАА БҮГДИЙГ ХАРУУЛНА
    for (let i = 0; i < allData.length; i++) {
        createPost(allData[i], i);
    }

  } catch (error) {
    console.error('Error fetching data:', error);
  }
}

// POST ҮҮСГЭХ FUNCTION (код давтагдахгүй болгоно)
function createPost(blog, i) {
    const blogDiv = document.createElement("div");

    const number = document.createElement("p");
    const title = document.createElement("h1");
    const body = document.createElement("p");

    number.classList.add("number");
    blogDiv.classList.add("blog-container");

    number.textContent = i + 1;
    title.textContent = blog.title;
    body.textContent = blog.body;

    blogDiv.appendChild(number);
    blogDiv.appendChild(title);
    blogDiv.appendChild(body);

    mainElement.appendChild(blogDiv);
}

// 🔍 SEARCH
input.addEventListener("input", () => {
    const value = input.value.toLowerCase();

    // хуучин постуудыг устгана
    document.querySelectorAll(".blog-container").forEach(el => el.remove());

    // filter хийж дахин зурна
    for (let i = 0; i < allData.length; i++) {
        const blog = allData[i];

        if (
            blog.title.toLowerCase().includes(value) ||
            blog.body.toLowerCase().includes(value)
        ) {
            createPost(blog, i);
        }
    }
});

getData();
//         title: "title edweded",
//         body: "lorem "
//     },
//     {
//         title: "title ",
//         body: "lorem "
//     },
//     {
//         title: "title ",
//         body: "lorem "
//     },
//     {
//         title: "title ",
//         body: "lorem "
//     },
//     {
//         title: "title ",
//         body: "loremcefwewfewf "
//     },
// ];

// const API_URL = "https://jsonplaceholder.typicode.com/posts";

// const mainElement = document.getElementsByTagName("main")[0];
// async function getData() {
//   try {
//     const response = await fetch(API_URL);
//     if (!response.ok) throw new Error(`HTTP error! Status: ${response.status}`);
    
//     const data = await response.json(); // Parses the JSON into a JS object
//     console.log(data);
//     for (let i = 0; i < data.length; i++) {
//         const blog = data[i]
//         const blogDiv = document.createElement("div")

//         const number = document.createElement("p");
//         number.classList.add("number");
//         const title =document.createElement("h1");
//         const body = document.createElement("p");
//         number.textContent = i + 1;
//         title.textContent = blog.title;
//         body.textContent = blog.body;
//         blogDiv.classList.add("blog-container");
//         blogDiv.appendChild(number);
        
//         blogDiv.appendChild(title);

//         blogDiv.appendChild(body);
//         mainElement.appendChild(blogDiv);



//     }
//   } catch (error) {
//     console.error('Error fetching data:', error);
//   }
// }
// getData();
// input.addEventListener("input", () => {
//     const searchText = input.value.toLowerCase();

//     const filteredPosts = allPosts.filter(post =>
//         post.title.toLowerCase().includes(searchText) ||
//         post.body.toLowerCase().includes(searchText)
//     );

//     displayPosts(filteredPosts);
// });


// for (let i = 0; i < blogs.length; i++) {
//   const blog = blogs[i];

//   const title = document.createElement("h1");
//   const body = document.createElement("p");

//   title.textContent = blog.title;
//   body.textContent = blog.body;

//   mainElement.append(title, body);
// }