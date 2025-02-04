function createSnowflakes(numSnowflakes) {
  const img = document.getElementById('about').querySelector('img');
  const imgRect = img.getBoundingClientRect();

  for (let i = 0; i < numSnowflakes; i++) {
    const snowflake = document.createElement('div');
    snowflake.classList.add('snowflake');

    // Случайные размеры и вращение
    const size = Math.random() * 5 + 2; // Размер от 2 до 7 пикселей
    const rotation = Math.random() * 360; // Случайное вращение
    snowflake.style.width = `${size}px`;
    snowflake.style.height = `${size}px`;
    snowflake.style.transform = `rotate(${rotation}deg)`;

    // Добавляем снежинку к изображению
    img.appendChild(snowflake);

  }
}


// Создаем 20 снежинок
createSnowflakes(20);

