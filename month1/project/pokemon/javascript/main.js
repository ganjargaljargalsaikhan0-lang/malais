const container = document.getElementById("pokemon-container");
let allPokemon = [];

function fetchPokemon() {
    fetch("https://pokeapi.co/api/v2/pokemon?offset=0&limit=50")
    .then(response => response.json())
    .then(data => {
        const promises = data.results.map(pokemon => 
            fetch(pokemon.url)
            .then(res => res.json())
            .then(details => ({
                id: details.id,
                name: details.name,
                image: details.sprites.other["official-artwork"].front_default,
                types: details.types.map(type => type.type.name)
            }))
        );
        return Promise.all(promises);
    })
    .then(pokemonDetails => {
        allPokemon = pokemonDetails;
        displayPokemon(pokemonDetails);
    })
    .catch(error => console.error("Error fetching data", error));
}


function getTypeColor(type) {
    const typeColors = {
        fire: "#FF6464",
        water: "#9ff3ff",
        grass: "#80E177",
        electric: "#FFFA86",
        ice: "#AEFFF4",
        fighting: "#FF699F",
        poison: "#D89CFD",
        ground: "#FFBF72",
        flying: "linear-gradient(180deg, #CBE9FF 0%, #29E 100%)",
        psychic: "#FF5E60",
        bug: "#C9FF84",
        rock: "#CFC06F",
        ghost: "#B592FF",
        dragon: "#87C5FF",
        dark: "#8F8F8F",
        steel: "#A4FFE9",
        fairy: "#FFA2E3",
        normal: "#CBCBCB"
    };
    return typeColors[type] || "#a8a878";
}

function cardColor(type) {
    const typeColors = {
        fire: "#EB6C6C",
        water: "#009ACB",
        grass: "#1EBA11",
        electric: "#B7B117",
        ice: "#98D8D8",
        fighting: "#BA114E",
        poison: "#7E00CB",
        ground: "#A77437",
        flying: "#A890F0",
        psychic: "#C4484A",
        bug: "#91AC22",
        rock: "#857D57",
        ghost: "#6B2BF1",
        dragon: "#1268B8",
        dark: "#373737",
        steel: "#448F85",
        fairy: "#C01A8D",
        normal: "#B6B6B6"
    };
    return typeColors[type] || "#a8a878";
}

function displayPokemon(pokemonlist) {
    console.log(pokemonlist);
    container.innerHTML = "";
    pokemonlist.forEach(pokemon => {
        const card = document.createElement("div");
        card.classList.add("pokemon-card");
        card.style.background = cardColor(pokemon.types[0]);

        const image = document.createElement("img");
        image.src = pokemon.image;
        image.classList.add("pokemon-image");

        const name = document.createElement("h2");
        name.textContent = pokemon.name;
        name.classList.add("pokemon-name");

        const types = document.createElement("div");
        types.innerHTML = pokemon.types.map(type => `
            <span class="pokemon-type" style="background: ${getTypeColor(type)};">
                ${type}
            </span>
        `).join("");
        types.classList.add("pokemon-types");

        const id = document.createElement("div");
        const pokemonID = parseInt(pokemon.id) < 10 ? `#00${pokemon.id}` : `#0${pokemon.id}`;
        id.classList.add("pokemon-id");

        id.textContent = pokemonID.toString();
        
        card.appendChild(image);
        card.appendChild(name);
        card.appendChild(id);
        card.appendChild(types);
        container.appendChild(card);
    });
}

fetchPokemon();