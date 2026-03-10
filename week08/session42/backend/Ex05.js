// Build a simple receipt printer

const storeName = "iCode Cafe";
const items = ["Coffee", "Muffin", "Water"];
const prices = [4.5, 3.0, 1.5];

function printReceipt(store, itemList, priceList) {

    console.log(`===${store}===`);
    console.log()
    let total = 0;

    
    for (let i = 0; i < itemList.length; i++) {
        console.log(`${itemList[i]} - $${priceList[i]}`);
        total += priceList[i];
    }

    
    console.log(`Total: $${total}`);

    // TODO:
    // Print the store name
    // Print each item with its price: "Coffee - $4.5"
    // Print "Total: $X" where X is the sum of all prices
}

printReceipt(storeName, items, prices);