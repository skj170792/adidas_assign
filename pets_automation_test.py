import requests

URL = 'https://petstore.swagger.io'


class TestPets:

    pet_id = None

    def test_get_available_pets(self):

        get_url = URL + '/v2/pet/findByStatus?status=available'
        resp = requests.get(get_url)

        assert resp.status_code == 200

    def test_post_new_pet(self):

        post_url = URL + '/v2/pet'

        pet_data = {
            "id": 0,
            "category": {
                "id": 0,
                "name": "string"
            },
            "name": "new_doggie",
            "photoUrls": [
                "string"
            ],
            "tags": [
                {
                    "id": 0,
                    "name": "string"
                }
            ],
            "status": "available"
        }

        headers = {"Content-Type": "application/json"}

        resp = requests.post(post_url, headers=headers, json=pet_data)
        assert resp.status_code == 200

        resp = resp.json()
        TestPets.pet_id = resp["id"]

    def test_change_status_to_sold(self):
        update_url = URL + '/v2/pet'

        pet_data = {
            "id": TestPets.pet_id,
            "category": {
                "id": 0,
                "name": "string"
            },
            "name": "new_doggie",
            "photoUrls": [
                "string"
            ],
            "tags": [
                {
                    "id": 0,
                    "name": "string"
                }
            ],
            "status": "sold"
        }

        headers = {"Content-Type": "application/json"}

        resp = requests.put(update_url, headers=headers, json=pet_data)
        assert resp.status_code == 200

    def test_delete_pet(self):

        delete_url = URL + '/v2/pet/' + str(TestPets.pet_id)
        resp = requests.delete(delete_url)
        assert resp.status_code == 200
