import { expect, test } from '@playwright/test';

test('EPAM Services -> Explore Our Client Work shows Client Work text', async ({ page }) => {
  await page.goto('https://www.epam.com/');

  const servicesMenu = page.getByRole('link', { name: 'Services' });
  await servicesMenu.hover();
  await servicesMenu.click();

  await page.getByRole('link', { name: 'Explore Our Client Work' }).click();

  await expect(page.getByText('Client Work', { exact: true })).toBeVisible();
});
