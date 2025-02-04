function createSnowflakes(numSnowflakes) {
  const img = document.getElementById('about').querySelector('img');
  const imgRect = img.getBoundingClientRect();

  for (let i = 0; i < numSnowflakes; i++) {
    const snowflake = document.createElement('div');
    snowflake.classList.add('snowflake');

    
    const size = Math.random() * 5 + 2; 
    const rotation = Math.random() * 360; 
    snowflake.style.width = `${size}px`;
    snowflake.style.height = `${size}px`;
    snowflake.style.transform = `rotate(${rotation}deg)`;

  
    img.appendChild(snowflake);

  }
}



createSnowflakes(20);

